package org.dp.Exam.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="crew")//піхота механізованої бригади
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SoldierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    public String name;//ім'я
    public String rank;//звання
    public String occup;//професія
    public String imgsrc;//фото

}