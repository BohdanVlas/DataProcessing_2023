package org.dp.Exam.controller;

import org.dp.Exam.entity.SoldierEntity;
import org.dp.Exam.repository.SoldierRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5300")
@RestController
@RequestMapping("/api/crew")
@Slf4j
public class SoldierController {

    @Autowired
    SoldierRepository soldierRepository;

    @GetMapping("/retrieve")
    public List<SoldierEntity> getEntities(){
        List<SoldierEntity> list;
        log.info("[SOLDIER CONTROLLER] Before GET");
        list = soldierRepository.findAll();
        log.info("[SOLDIER CONTROLLER] After GET Found {} soldiers", list.size());
        return soldierRepository.findAll();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public SoldierEntity postEntity(@RequestBody SoldierEntity soldierEntity){
        log.info("[SOLDIER CONTROLLER] After POST Found new smt {} ", soldierEntity);
        return soldierRepository.save(soldierEntity);
    }

    @PutMapping("/update/{id}")
    public SoldierEntity putEntity(@PathVariable long id, @RequestBody SoldierEntity newEnt){
        SoldierEntity updEnt = soldierRepository.findById(id)
                .orElseThrow(()-> new ResourceAccessException("Not found SoldierEntity with id: "+id));
        updEnt.setName(newEnt.getName());
        updEnt.setRank(newEnt.getRank());
        updEnt.setOccup(newEnt.getOccup());
        updEnt.setImgsrc(newEnt.getImgsrc());
        log.info("[SOLDIER CONTROLLER] After PUT Found updated SoldierEntity {} ", updEnt);
        return soldierRepository.save(updEnt);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntity(@PathVariable long id){
        SoldierEntity delEntity = soldierRepository.findById(id)
                .orElseThrow(()-> new ResourceAccessException("Not found SoldierEntity with id: "+id));
        log.info("[SOLDIER CONTROLLER] After DELETE SoldierEntity {} ", delEntity);
        soldierRepository.deleteById(id);
    }

}