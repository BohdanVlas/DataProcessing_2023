package Servlets;

import Entity.Ka27LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka27LTHServlet")
public class Ka27LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka27LTHEntity LTH = new Ka27LTHEntity(
                "ЛТХ Ка-27",
                "Ka-27_sxema-1.png",
                "Ka-27",
                "Ka-27",
                "15,9",
                "12,25",
                "5,4",
                "3,8",
                "3",
                "ТВД ТВЗ-117ВК - 2 по 2200кс",
                "270",
                "118",
                "3500",
                "5000",
                "1000",
                "200",
                "12000",
                "10600",
                "6100",
                "2000");

        String Ka27LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka27LTHJson);
        out.flush();
    }
}
