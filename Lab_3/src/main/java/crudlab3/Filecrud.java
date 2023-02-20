package crudlab3;

import Entity.MainEntity;
import File_IO.FileIOInterface;
import File_IO.fileIO;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Filecrud extends CrudInterface {
    FileIOInterface fio;
    public Filecrud() {
        this.fio = new fileIO();
    }
    @Override
    public MainEntity readEntity() {
        return (MainEntity) fio.loadFromFile();
    }

    @Override
    public void updateEntity(MainEntity main) {
        fio.savetoFile(main);
    }

    public JsonElement bodyParse(HttpServletRequest request){
        JsonElement jsonElement = null;

        try {
            jsonElement = JsonParser.parseReader(request.getReader());
        } catch ( IOException e) {
            e.printStackTrace();
        }

        return jsonElement;
    }
    public int cntt;
    public String id;
    public String p1;
    public String p2;
    public String p3;
    public String imgsrc;
    public String imgalt;
    public String imgtitle;
    public String button1;
    public String button2;
    public String button3;


    @Override
    public MainEntity Parse(HttpServletRequest request) {
        MainEntity main = new MainEntity(cntt, id, p1, p2, p3, imgsrc, imgalt, imgtitle, button1, button2, button3);
        JsonElement jsonElement = bodyParse(request);
        main.setCnt(jsonElement.getAsJsonObject().get("cnt").getAsInt());
        main.setId(jsonElement.getAsJsonObject().get("id").getAsString());
        main.setP1(jsonElement.getAsJsonObject().get("p1").getAsString());
        main.setP2(jsonElement.getAsJsonObject().get("p2").getAsString());
        main.setP3(jsonElement.getAsJsonObject().get("p3").getAsString());
        main.setImgsrc(jsonElement.getAsJsonObject().get("imgsrc").getAsString());
        main.setImgalt(jsonElement.getAsJsonObject().get("imgalt").getAsString());
        main.setImgtitle(jsonElement.getAsJsonObject().get("imgtitle").getAsString());
        main.setButton1(jsonElement.getAsJsonObject().get("button1").getAsString());
        main.setButton2(jsonElement.getAsJsonObject().get("button1").getAsString());
        main.setButton3(jsonElement.getAsJsonObject().get("button1").getAsString());

        return main;
    }

    @Override
    public int getIndexById(int Cnt, List<MainEntity> mainlist) {
        int mainlistCnt = Cnt;

        Iterator<MainEntity> iterator = mainlist.iterator();
        while(((Iterator<?>) iterator).hasNext()) {
            MainEntity mainn = iterator.next();
            if(mainlistCnt == mainn.getCnt()) {
                mainlistCnt = mainlist.indexOf(mainn);
                break;
            }
        }
        return mainlistCnt;
    }
    @Override
    public int getNextId(List<MainEntity> mainlist) {
        int maxCnt = 0;

        Iterator<MainEntity> iterator = mainlist.iterator();
        while(iterator.hasNext()) {
            int curCnt = iterator.next().getCnt();
            if(curCnt>maxCnt) maxCnt=curCnt;
        }
        return maxCnt+1;
    }
}
