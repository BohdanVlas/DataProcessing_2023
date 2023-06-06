package org.lab.Lab_5.repos;

import org.lab.Lab_5.entity.HistoryElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElemRepo extends JpaRepository<HistoryElement, String> {

}
