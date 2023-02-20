package Servlets;

import Entity.Mi14LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14LTHServlet")
public class Mi14LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14LTHEntity LTH = new Mi14LTHEntity(
                "ЛТХ Мі-14",
                "Mi-14_sxema-1.png",
                "Mi-14",
                "Mi-14",
                "21,29",
                "3,91",
                "25,24",
                "6,93",
                "3,8м(по поплавкам 5м)",
                "4",
                "ТВД ТВЗ-117М - 2 по 2000кс",
                "230",
                "210",
                "1600",
                "4000",
                "200",
                "14500",
                "13400",
                "8900",
                "2000",
                "19",
                "800");

        String Mi14LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14LTHJson);
        out.flush();
    }
}
