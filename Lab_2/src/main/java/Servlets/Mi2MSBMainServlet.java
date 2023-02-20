package Servlets;

import Entity.Mi2MSBMainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi2MSBMainServlet")
public class Mi2MSBMainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi2MSBMainEntity main = new Mi2MSBMainEntity(
                "Мі-2МСБ",
                "Мі-2(Hoplite за класифікацією НАТО)",
                "Мі-2МСБ - український багатоцільовий гелікоптер, створений ПАТ «Мотор Січ» на основі Мі-2.",
                "Mi-2MSB(1-1).jpg",
                "Mi-2MSB",
                "Mi-2МСБ");

        String MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(MainJson);
        out.flush();
    }
}
