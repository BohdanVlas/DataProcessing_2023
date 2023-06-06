package org.lab.Lab_5.entity;

import jakarta.persistence.*;

@Entity
@Table(name="History")
public class HistoryElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int num;
    private String id;
    private String clas;
    private String year;
    private String imgsrc;
    private String text;

    public HistoryElement() {}

    public HistoryElement(int num, String id, String clas, String year, String imgsrc, String text) {
        super();
        this.num = num;
        this.id = id;
        this.clas = clas;
        this.year = year;
        this.imgsrc = imgsrc;
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public java.lang.String toString() {
        return "HistoryEntity{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", clas='" + clas + '\'' +
                ", year='" + year + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}