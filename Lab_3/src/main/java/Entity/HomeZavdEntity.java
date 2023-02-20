package Entity;

public class HomeZavdEntity {
    private String zavd1;
    private String zavd2;
    private String zavd3;
    private String zavd4;
    private String zavd5;
    private String zavd6;
    private String zavd7;

    public HomeZavdEntity(String zavd1, String zavd2, String zavd3, String zavd4, String zavd5, String zavd6, String zavd7) {
        this.zavd1 = zavd1;
        this.zavd2 = zavd2;
        this.zavd3 = zavd3;
        this.zavd4 = zavd4;
        this.zavd5 = zavd5;
        this.zavd6 = zavd6;
        this.zavd7 = zavd7;
    }

    public String getZavd1() {
        return zavd1;
    }

    public void setZavd1(String zavd1) {
        this.zavd1 = zavd1;
    }

    public String getZavd2() {
        return zavd2;
    }

    public void setZavd2(String zavd2) {
        this.zavd2 = zavd2;
    }

    public String getZavd3() {
        return zavd3;
    }

    public void setZavd3(String zavd3) {
        this.zavd3 = zavd3;
    }

    public String getZavd4() {
        return zavd4;
    }

    public void setZavd4(String zavd4) {
        this.zavd4 = zavd4;
    }

    public String getZavd5() {
        return zavd5;
    }

    public void setZavd5(String zavd5) {
        this.zavd5 = zavd5;
    }

    public String getZavd6() {
        return zavd6;
    }

    public void setZavd6(String zavd6) {
        this.zavd6 = zavd6;
    }

    public String getZavd7() {
        return zavd7;
    }

    public void setZavd7(String zavd7) {
        this.zavd7 = zavd7;
    }

    @Override
    public String toString() {
        return "{\"zavd1\": \""+zavd1+"\", \"zavd2\": \""+zavd2+"\", \"zavd3\": \""+zavd3+"\", \"zavd4\": \""+zavd4+"\",\"zavd5\": \""+zavd5+"\",\"zavd6\": \""+zavd6+"\",\"zavd7\": \""+zavd7+"\"}";
    }
}