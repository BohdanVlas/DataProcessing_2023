package Servlets;

import Entity.Mi14ModEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14ModServlet")
public class Mi14ModServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14ModEntity mod = new Mi14ModEntity(
                "Мі-14ПЛ, Мі-14ПЛМ, Мі-14ПС",
                "Модернізації вертольоту Мі-14, що стоять на озброєнні ВМС ЗСУ",
                "Mi-14PL(3-1).jpg",
                "Mi-14PL",
                "Mi-14ПЛ",
                "Мі-14ПЛ — протичовновий",
                "Mi-14PLM(2-1).jpg",
                "Mi-14PLM",
                "Mi-14ПЛМ",
                "Мі-14ПЛМ — протичовновий модернізований",
                "Mi-14PS(1-1).jpg",
                "Mi-14PS",
                "Mi-14ПС",
                "Мі-14ПС — рятувальний");
        String Mi14ModJson = new Gson().toJson(mod);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14ModJson);
        out.flush();
    }
}
