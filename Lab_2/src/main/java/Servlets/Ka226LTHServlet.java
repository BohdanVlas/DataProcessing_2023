package Servlets;

import Entity.Ka226LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka226LTHServlet")
public class Ka226LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka226LTHEntity LTH = new Ka226LTHEntity(
                "ЛТХ Ка-226",
                "13",
                "8,1",
                "4,15",
                "3,25",
                "1-2",
                "ГТ Arrius 2G1 - 2 по 580кс",
                "210",
                "195",
                "4100",
                "5700",
                "600",
                "600",
                "3400",
                "3100",
                "1950",
                "4-7<BR>поранених(в залежності від<BR>встановленого модуля)");

        String Ka226LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka226LTHJson);
        out.flush();
    }
}
