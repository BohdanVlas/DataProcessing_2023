package Servlets;

import Entity.Mi14MainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14MainServlet")
public class Mi14MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14MainEntity main = new Mi14MainEntity(
                "Мі-14ПЛ, Мі-14ПЛМ, Мі-14ПС",
                "Мі-14(Haze за класифікацією НАТО)",
                "Мі-14 - морський багатоцільовий вертоліт-амфібія берегового базування, розробки ОКБ М. Л. Міля.",
                "Mi-14PLM(3-1).jpg",
                "Mi-14PLM",
                "Mi-14ПЛМ");

        String Mi14MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14MainJson);
        out.flush();
    }
}
