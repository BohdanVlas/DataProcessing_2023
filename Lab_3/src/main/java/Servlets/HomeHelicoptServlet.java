package Servlets;

import Entity.HomeHelicoptEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HomeHelicoptServlet")
public class HomeHelicoptServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HomeHelicoptEntity helicopt = new HomeHelicoptEntity(
                "Гелікоптери:",
                "Авіація ПС ЗСУ:",
                "Універсальні - Мі-8МТ",
                "Авіація СВ ЗСУ:",
                "Ударні - Мі-24П",
                "Багатофункціональні - Мі-8",
                "Багатоцільові - Мі-8МСБ, Мі-2МСБ",
                "Авіація ВМС ЗСУ:",
                "Санітарні - Ка-226",
                "Протичовнові/пошуково-рятувальні - Ка-27, Мі-14ПС, Мі-14ПЛ, Мі-14ПЛМ",
                "Транспортно-бойові - Ка-29");
        String HelicoptJson = new Gson().toJson(helicopt);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(HelicoptJson);
        out.flush();
    }
}
