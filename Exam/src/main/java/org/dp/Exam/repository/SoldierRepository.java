package org.dp.Exam.repository;

import org.dp.Exam.entity.SoldierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "crew", path = "crew")
public interface SoldierRepository extends JpaRepository<SoldierEntity, Long> {

}