package Servlets;

import Entity.Mi2MSBLTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi2MSBLTHServlet")
public class Mi2MSBLTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi2MSBLTHEntity LTH = new Mi2MSBLTHEntity(
                "ЛТХ Мі-2",
                "1-2",
                "ТВД АІ-450М - 2 по 465кс",
                "250",
                "5000",
                "3700",
                "8",
                "14,5");

        String LTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(LTHJson);
        out.flush();
    }
}
