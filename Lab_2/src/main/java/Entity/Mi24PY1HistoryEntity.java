package Entity;

public class Mi24PY1HistoryEntity {
    private String p1;
    private String p2;

    public Mi24PY1HistoryEntity(String p1, String p2) {
        this.p1 = p1;
        this.p2 = p2;
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

    @Override
    public String toString() {
        return "Mi24PY1HistoryEntity{" +
                "p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                '}';
    }
}
