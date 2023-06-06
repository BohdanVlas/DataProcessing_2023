package org.lab.Lab_6.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="History")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HistoryElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int num;
    private String id;
    private String clas;
    private String year;
    private String imgsrc;
    private String text;
}