package org.lab.Lab_7.controls;

import org.lab.Lab_7.entity.HistoryElement;
import org.lab.Lab_7.repos.ElemRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8300")
@RestController
@RequestMapping("/historyent")
@Slf4j
public class HistController {
    @Autowired
    private ElemRepo elemRepo;

    @GetMapping("/retrieve")
    public List<HistoryElement> getEntities(){
        List<HistoryElement> lst;
        lst = elemRepo.findAll();
        return elemRepo.findAll();
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public HistoryElement postEntity(@RequestBody HistoryElement historyentity){
        return elemRepo.save(historyentity);
    }

    @PutMapping("/update/{num}")
    public HistoryElement putEntity(@PathVariable long num, @RequestBody HistoryElement newEnt){
        HistoryElement updEntity = elemRepo.findById(num)
                .orElseThrow(()-> new ResourceAccessException("Not found"));
        updEntity.setNum(newEnt.getNum());
        updEntity.setId(newEnt.getId());
        updEntity.setClas(newEnt.getClas());
        updEntity.setYear(newEnt.getYear());
        updEntity.setImgsrc(newEnt.getImgsrc());
        updEntity.setText(newEnt.getText());
        return elemRepo.save(updEntity);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEntity(@PathVariable long num){
        elemRepo.deleteById(num);
    }
}
