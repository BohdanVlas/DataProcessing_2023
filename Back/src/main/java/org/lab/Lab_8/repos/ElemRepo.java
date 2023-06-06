package org.lab.Lab_8.repos;

import org.lab.Lab_8.entity.HistoryElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "history", path = "history")
public interface ElemRepo extends JpaRepository<HistoryElement, Long> {

}