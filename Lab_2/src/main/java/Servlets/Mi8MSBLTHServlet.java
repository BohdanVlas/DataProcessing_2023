package Servlets;

import Entity.Mi8MSBLTHEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8MSBLTHServlet")
public class Mi8MSBLTHServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8MSBLTHEntity LTH = new Mi8MSBLTHEntity(
                "ЛТХ Мі-8МСБ",
                "21,3",
                "3,91",
                "18,4",
                "4,86",
                "2,5",
                "3",
                "ТВД ТВ3-117ВМА-СБМ1В серії 4Е - 2 по 2500кс",
                "280",
                "250",
                "2400",
                "7000",
                "1210",
                "600",
                "12500",
                "11500",
                "~7500",
                "4000",
                "34");

        String Mi8MSBLTHJson = new Gson().toJson(LTH);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8MSBLTHJson);
        out.flush();
    }
}
