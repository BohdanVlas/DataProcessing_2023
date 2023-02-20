package Entity;

public class Mi8MSBMainEntity {
    private String p1;
    private String p2;
    private String p3;
    private String imgsrc;
    private String imgalt;
    private String imgtitle;

    public Mi8MSBMainEntity(String p1, String p2, String p3, String imgsrc, String imgalt, String imgtitle) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.imgsrc = imgsrc;
        this.imgalt = imgalt;
        this.imgtitle = imgtitle;
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

    @Override
    public String toString() {
        return "Mi8MSBMainEntity{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", imgalt='" + imgalt + '\'' +
                ", imgtitle='" + imgtitle + '\'' +
                '}';
    }
}
