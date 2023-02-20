package Servlets;

import Entity.Ka27OzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka27OzbrServlet")
public class Ka27OzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka27OzbrEntity ozbr = new Ka27OzbrEntity(
                "Ка-27",
                "Для ураження підводних човнів у відсіку озброєння розміщуються протичовнові торпеди АТ-1МВ,<BR>глибинні бомби, авіабомби калібру від 50 до 250 кг.",
                "На вертольоті можуть бути встановлені також керовані протичовнові ракети АПР-2Е.",
                "АПР-2Е",
                "APR-2.jpg",
                "APR-2",
                "АПР-2Е");
        String Ka27OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka27OzbrJson);
        out.flush();
    }
}
