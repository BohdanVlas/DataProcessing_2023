package Servlets;

import Entity.Mi24LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24LTHServlet")
public class Mi24LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24LTHEntity LTH = new Mi24LTHEntity(
                "ЛТХ Мі-24П",
                "Mi-24.png",
                "Mi-24",
                "Mi-24",
                "17,3",
                "1,5",
                "17,52",
                "3,9",
                "1,7",
                "2",
                "ТВД ТВ3-117 – 2 по 2200кс",
                "335",
                "270",
                "1500",
                "4500",
                "224",
                "12000",
                "11200",
                "8200",
                "2500",
                "8",
                "1000",
                "4");

        String Mi24LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24LTHJson);
        out.flush();
    }
}
