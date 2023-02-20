package Servlets;

import Entity.Mi2MSBOzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi2MSBOzbrServlet")
public class Mi2MSBOzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi2MSBOzbrEntity ozbr = new Mi2MSBOzbrEntity(
                "Мі-2МСБ",
                "Мі-2МСБ обладнаний двома фермами для розміщення блоків Б8В20А некерованих ракет(С-8),<BR>ПТРК, ЗРК або УПК-23-250 (гарматний контейнер з двоствольною 23-мм гарматою ГШ-23Л з<BR>боєкомплектом 250 снарядів).");

        String OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(OzbrJson);
        out.flush();
    }
}
