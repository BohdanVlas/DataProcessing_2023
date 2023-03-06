package Servlets;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import Entity.HistoryEntity;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class CRUDConfig {

    public static JsonElement bodyParse(HttpServletRequest request) {
        JsonElement jsonElement = null;

        try {
            jsonElement = JsonParser.parseReader(request.getReader());
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }

        return jsonElement;
    }

    public static HistoryEntity historyParse(HttpServletRequest request) {
        HistoryEntity history = new HistoryEntity();
        JsonElement jsonElement = bodyParse(request);
        history.setId(jsonElement.getAsJsonObject().get("id").getAsString());
        history.setClas(jsonElement.getAsJsonObject().get("clas").getAsString());
        history.setYear(jsonElement.getAsJsonObject().get("year").getAsString());
        history.setImgsrc(jsonElement.getAsJsonObject().get("imgsrc").getAsString());
        history.setText(jsonElement.getAsJsonObject().get("text").getAsString());
        return history;
    }

    public static int getNextNum(List<HistoryEntity> list) {
        int maxNum = 0;

        Iterator<HistoryEntity> iterator = list.iterator();
        while(iterator.hasNext()) {
            int currentNum = iterator.next().getNum();
            if(currentNum>maxNum) maxNum=currentNum;
        }
        return maxNum+1;
    }

    public static int getNumByUInd(int ind,List<HistoryEntity> list) {
        int listInd = ind;

        Iterator<HistoryEntity> iterator = list.iterator();
        while(iterator.hasNext()) {
            HistoryEntity hist = iterator.next();
            if(hist.getNum() == listInd) {
                listInd = list.indexOf(hist);
                break;
            }
        }
        return listInd;
    }
}
