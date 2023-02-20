package Servlets;

import crud.FileCrud;
import crud.Ka226MainCrudInterface;

public class Ka226MainServletConfig implements Ka226MainServletConfigInterface {

    public Ka226MainServletConfig(){
        this.l2ci = new FileCrud();
    }
    public void setL2ci(Ka226MainCrudInterface l2ci) {
        this.l2ci = l2ci;
    }

    Ka226MainCrudInterface l2ci;
    @Override
    public Ka226MainCrudInterface getCrud(){
        return l2ci;
    }
}
