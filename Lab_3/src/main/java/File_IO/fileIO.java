package File_IO;

import java.io.*;

public class fileIO extends FileIOInterface {
    private String Name="Main.txt";

    public String getFileName() {
        return Name;
    }

    public void setFileName(String fileName) {
        this.Name = fileName;
    }


    @Override
    public void savetoFile(Object object) {

        try {
            FileOutputStream FOS = new FileOutputStream(Name);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);
            OOS.writeObject(object);
            OOS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public Object loadFromFile(){

        Object res = null;

        try {
            FileInputStream FIS = new FileInputStream(Name);
            ObjectInputStream OIS = new ObjectInputStream(FIS);
            res = OIS.readObject();
            OIS.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return res;

    }
}
