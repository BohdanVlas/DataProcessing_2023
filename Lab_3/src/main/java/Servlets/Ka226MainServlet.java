package Servlets;

import Entity.Ka226MainEntity;
import com.google.gson.Gson;
import crud.Ka226MainCrudInterface;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka226MainServlet")
public class Ka226MainServlet extends HttpServlet {
    Ka226MainServletConfigInterface Ka226MainServletConfig;
    Ka226MainCrudInterface Ka226MainCrud;

    public Ka226MainServlet() {
        super();
        this.Ka226MainServletConfig = new Ka226MainServletConfig();
        this.Ka226MainCrud = Ka226MainServletConfig.getCrud();
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka226MainEntity main = new Ka226MainEntity(
                "Ка-226",
                "Ка-226(Hoodlum за класифікацією НАТО)",
                "Ка-226 — багатоцільовий вертоліт, розроблений у ДКБ Камова. Є модернізацією вертольоту Ка-26.",
                "Ka-226(1-1).jpg",
                "Ka-226",
                "Ka-226");

        String Ka226MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka226MainJson);
        out.flush();
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name = request.getParameter("name");
        String namee = request.getParameter("namee");
        String nameee = request.getParameter("nameee");
        String imgsrc = request.getParameter("imgsrc");
        String imgalt = request.getParameter("imgalt");
        String imgtitle = request.getParameter("imgtitle");

        Ka226MainCrud.updateElement(new Ka226MainEntity(name, namee, nameee, imgsrc, imgalt, imgtitle));
    }
}