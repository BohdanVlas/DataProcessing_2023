package Servlets;

import Entity.Mi8LTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8LTHServlet")
public class Mi8LTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8LTHEntity LTH = new Mi8LTHEntity(
                "ЛТХ Мі-8",
                "Mi-8MT-.jpg",
                "Mi-8",
                "Mi-8",
                "21,3",
                "3,91",
                "18,4",
                "4,86",
                "2,5",
                "3",
                "ГТД ТВ3-117МТ - 2 по 1900кс",
                "250",
                "220",
                "1760",
                "5000",
                "520",
                "13000",
                "11100",
                "7200",
                "4000",
                "29",
                "18");

        String Mi8LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8LTHJson);
        out.flush();
    }
}
