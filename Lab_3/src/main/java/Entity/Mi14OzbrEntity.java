package Entity;

public class Mi14OzbrEntity {
    private String p1;
    private String p2;
    private String imgsrc;
    private String imgalt;
    private String imgtitle;
    private String pimg;

    public Mi14OzbrEntity(String p1, String p2, String pimg, String imgsrc, String imgalt, String imgtitle) {
        this.p1 = p1;
        this.p2 = p2;
        this.imgsrc = imgsrc;
        this.imgalt = imgalt;
        this.imgtitle = imgtitle;
        this.pimg = pimg;
    }

    @Override
    public String toString() {
        return "Mi14OzbrEntity{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", imgalt='" + imgalt + '\'' +
                ", imgtitle='" + imgtitle + '\'' +
                ", pimg='" + pimg + '\'' +
                '}';
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

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg;
    }
}
