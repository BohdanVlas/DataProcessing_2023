package org.lab.Lab_6.repos;

import org.lab.Lab_6.entity.HistoryElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElemRepo extends JpaRepository<HistoryElement, Long> {

}
