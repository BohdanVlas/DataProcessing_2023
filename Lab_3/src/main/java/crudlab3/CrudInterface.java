package crudlab3;

import Entity.MainEntity;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public class CrudInterface {
    public MainEntity readEntity() {
        return null;
    }


    public void updateEntity(MainEntity main) {

    }

    public MainEntity Parse(HttpServletRequest request) {
        return null;
    }

    public int getIndexById(int id, List<MainEntity> mainlist) {
        return 0;
    }

    public int getNextId(List<MainEntity> mainlist) {
        return 0;
    }
}
