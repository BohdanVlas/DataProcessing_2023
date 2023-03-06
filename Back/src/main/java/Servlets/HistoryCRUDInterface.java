package Servlets;

import java.util.List;

public interface HistoryCRUDInterface<H> {

    public void create(H h);
    public List<H> read();
    public void update(int Num, H h);
    public void delete(int Num);

}