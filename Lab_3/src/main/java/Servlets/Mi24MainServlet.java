package Servlets;

import Entity.Mi24MainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24MainServlet")
public class Mi24MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24MainEntity main = new Mi24MainEntity(
                "Мі-24П",
                "Мі-24(Hind за класифікацією НАТО)",
                "Мі-24 є одним із найвідоміших бойових вертольотів у світі. Став одним із символів Війни в Афганістані,<BR>де і отримав прізвисько 'Крокодил'",
                "Mi-24(3).jpg",
                "Mi-24",
                "Mi-24");

        String Mi24MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24MainJson);
        out.flush();
    }
}
