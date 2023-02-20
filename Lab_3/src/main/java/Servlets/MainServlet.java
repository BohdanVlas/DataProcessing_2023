package Servlets;

import Entity.MainEntity;
import Entity.MainListEntity;
import com.google.gson.Gson;
import crudlab3.CrudInterface;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

    private List<MainEntity> maiin = new MainListEntity().getMainEntity();
    MainServletConfInterface servletConfig;
    CrudInterface crud;

    public MainServlet() {
        super();
        this.servletConfig = new MainServletConf();
        this.crud = servletConfig.getCrud();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String maain = new Gson().toJson(maiin);
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");

        out.print(maain);
        out.flush();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MainEntity maiinn = crud.Parse(request);
        maiinn.setCnt(crud.getNextId(maiin));
        maiin.add(maiinn);
        doGet(request, response);


    }
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException {

        MainEntity maiinn = crud.Parse(request);
        int id = Integer.parseInt(request.getPathInfo().substring(1));
        response.setContentType("application/json");
        int index = crud.getIndexById(id, maiin);
        maiin.set(index,maiinn);
        doGet(request, response);
    }


    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws  IOException {

        int cnt = Integer.parseInt(request.getPathInfo().substring(1));
        response.setContentType("application/json");
        int index = crud.getIndexById(cnt, maiin);
        maiin.remove(index);
        doGet(request, response);
    }

}
