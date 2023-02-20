package Servlets;

import Entity.Ka29MainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka29MainServlet")
public class Ka29MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka29MainEntity main = new Ka29MainEntity(
                "Ка-29",
                "Ка-29(Helix-B за класифікацією НАТО)",
                "Ка-29 - радянський корабельний транспортно-бойовий вертоліт, подальший розвиток вертольота Ка-27.",
                "Ka-29(3-1).jpg",
                "Ka-29",
                "Ka-29");

        String Ka29MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka29MainJson);
        out.flush();
    }
}
