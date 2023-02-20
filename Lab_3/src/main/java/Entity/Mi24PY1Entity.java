package Entity;

public class Mi24PY1Entity {
    private String p1;
    private String p2;
    private String img1src;
    private String img1alt;
    private String img1title;
    private String img2src;
    private String img2alt;
    private String img2title;

    public Mi24PY1Entity(String p1, String p2, String img1src, String img1alt, String img1title, String img2src, String img2alt, String img2title) {
        this.p1 = p1;
        this.p2 = p2;
        this.img1src = img1src;
        this.img1alt = img1alt;
        this.img1title = img1title;
        this.img2src = img2src;
        this.img2alt = img2alt;
        this.img2title = img2title;
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

    public String getImg1src() {
        return img1src;
    }

    public void setImg1src(String img1src) {
        this.img1src = img1src;
    }

    public String getImg1alt() {
        return img1alt;
    }

    public void setImg1alt(String img1alt) {
        this.img1alt = img1alt;
    }

    public String getImg1title() {
        return img1title;
    }

    public void setImg1title(String img1title) {
        this.img1title = img1title;
    }

    public String getImg2src() {
        return img2src;
    }

    public void setImg2src(String img2src) {
        this.img2src = img2src;
    }

    public String getImg2alt() {
        return img2alt;
    }

    public void setImg2alt(String img2alt) {
        this.img2alt = img2alt;
    }

    public String getImg2title() {
        return img2title;
    }

    public void setImg2title(String img2title) {
        this.img2title = img2title;
    }

    @Override
    public String toString() {
        return "Mi24PY1Entity{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", img1src='" + img1src + '\'' +
                ", img1alt='" + img1alt + '\'' +
                ", img1title='" + img1title + '\'' +
                ", img2src='" + img2src + '\'' +
                ", img2alt='" + img2alt + '\'' +
                ", img2title='" + img2title + '\'' +
                '}';
    }
}
