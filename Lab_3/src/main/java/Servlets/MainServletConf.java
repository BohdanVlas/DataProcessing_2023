package Servlets;

import crudlab3.CrudInterface;
import crudlab3.Filecrud;

public class MainServletConf extends MainServletConfInterface {

    CrudInterface ci;

    public MainServletConf(){
        this.ci = new Filecrud();
    }
    public void setMsci(CrudInterface msci) {
        this.ci = ci;
    }

    @Override
    public CrudInterface getCrud(){
        return ci;
    }
}
