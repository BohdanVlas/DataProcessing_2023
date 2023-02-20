package Servlets;

import Entity.Ka29LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka29LTHServlet")
public class Ka29LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka29LTHEntity LTH = new Ka29LTHEntity(
                "ЛТХ Ка-29",
                "15,9",
                "12,25",
                "5,44",
                "3,8",
                "2",
                "ТВД ТВЗ-117В - 2 по 2250кс",
                "280",
                "235",
                "3700",
                "4300",
                "740",
                "460",
                "11500",
                "11000",
                "1850",
                "16",
                "10");

        String Ka29LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka29LTHJson);
        out.flush();
    }
}
