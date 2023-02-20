package crud;

import Entity.Ka226MainEntity;
import fileIO.FileIO;
import fileIO.fileIOInterface;

public class FileCrud implements Ka226MainCrudInterface {

    fileIOInterface Fio;

    public FileCrud(){
        this.Fio = new FileIO();
    }

    @Override
    public Ka226MainEntity readElement() {
        return (Ka226MainEntity) Fio.loadFromFile();
    }

    @Override
    public void updateElement(Ka226MainEntity Ka226Main) {
        Fio.saveToFile(Ka226Main);
    }
}
