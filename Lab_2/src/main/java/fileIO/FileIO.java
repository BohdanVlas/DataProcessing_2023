package fileIO;

import java.io.*;

public class FileIO implements fileIOInterface{

    public String getFileName() {
        return filename;
    }

    public void setFileName(String filename) {
        this.filename = filename;
    }

    private String filename="file.txt";

    @Override
    public void saveToFile(Object object) {

        try {
            FileOutputStream FOS = new FileOutputStream(filename);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(object);
            OOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public Object loadFromFile(){
        Object result = null;

        try {
            FileInputStream FIS = new FileInputStream(filename);
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            result = OIS.readObject();
            OIS.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return result;

    }
}
