package Servlets;

import Entity.Ka27MainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka27MainServlet")
public class Ka27MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka27MainEntity main = new Ka27MainEntity(
                "Ка-27",
                "Ка-27(Helix за класифікацією НАТО)",
                "Ка-27 радянський корабельний багатофункціональний вертоліт.",
                "Ka-27(2-1).jpg",
                "Ka-27",
                "Ka-27");

        String Ka27MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka27MainJson);
        out.flush();
    }
}
