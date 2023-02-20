package Entity;

import java.io.Serializable;

public class MainEntity implements Serializable {

    private int cnt;
    private String id;
    private String p1;
    private String p2;
    private String p3;
    private String imgsrc;
    private String imgalt;
    private String imgtitle;
    private String button1;
    private String button2;
    private String button3;

    public MainEntity(int cnt, String id, String p1, String p2, String p3, String imgsrc, String imgalt, String imgtitle, String button1, String button2, String button3) {
        this.cnt = cnt;
        this.id = id;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.imgsrc = imgsrc;
        this.imgalt = imgalt;
        this.imgtitle = imgtitle;
        this.button1 = button1;
        this.button2 = button2;
        this.button3 = button3;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getImgalt() {
        return imgalt;
    }

    public void setImgalt(String imgalt) {
        this.imgalt = imgalt;
    }

    public String getImgtitle() {
        return imgtitle;
    }

    public void setImgtitle(String imgtitle) {
        this.imgtitle = imgtitle;
    }

    public String getButton1() {
        return button1;
    }

    public void setButton1(String button1) {
        this.button1 = button1;
    }

    public String getButton2() {
        return button2;
    }

    public void setButton2(String button2) {
        this.button2 = button2;
    }

    public String getButton3() {
        return button3;
    }

    public void setButton3(String button3) {
        this.button3 = button3;
    }

    @Override
    public String toString() {
        return "MainEntity{" +
                "cnt=" + cnt +
                ", id='" + id + '\'' +
                ", p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", imgalt='" + imgalt + '\'' +
                ", imgtitle='" + imgtitle + '\'' +
                ", button1='" + button1 + '\'' +
                ", button2='" + button2 + '\'' +
                ", button3='" + button3 + '\'' +
                '}';
    }
}
