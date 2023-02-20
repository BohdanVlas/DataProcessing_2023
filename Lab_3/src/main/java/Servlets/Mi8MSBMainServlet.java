package Servlets;

import Entity.Mi8MSBMainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8MSBMainServlet")
public class Mi8MSBMainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8MSBMainEntity main = new Mi8MSBMainEntity(
                "Мі-8МСБ-В",
                "Мі-8(Hip за класифікацією НАТО)",
                "Мі-8МСБ — український варіант модернізації радянського багатоцільового вертольота Мі-8,<BR>розроблений компанією «Мотор Січ».",
                "Mi-8MSB(3-1).jpg",
                "Mi-8MSB",
                "Mi-8МСБ");

        String Mi8MSBMainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8MSBMainJson);
        out.flush();
    }
}
