package Servlets;

import Entity.Mi8MSBOzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8MSBOzbrServlet")
public class Mi8MSBOzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8MSBOzbrEntity ozbr = new Mi8MSBOzbrEntity(
                "Мі-8МСБ-В",
                "На кожній фермі гелікоптера розміщується 3 вузли підвіски.",
                "Гелікоптер може бути озброєнний: ПТРК Бар'єр-В, керованими ракетами класу 'повітря-повітря',<BR>блоками НАР, зокрема НАРи: 55мм С-5, 80мм С-8, 122мм С-13, стрілецько-гарматним озброєнням,<BR>зокрема УПК-23-250, авіабомбами або системами повітряного мінування ВСМ-1.",
                "Для запуску НАРів використовуються різноманітні ПУ:<BR>УВ-32-57, УВ-20-57, УВ-20-80",
                "НАРи: 55мм С-5, 80мм С-8",
                "УВ-32-57, УВ-20-80",
                "S-5_57mm.jpg",
                "S-5_57mm",
                "C-5",
                "S-8_80mm.jpg",
                "S-8_80mm",
                "C-8",
                "PY-S-5.JPG",
                "PY-S-5",
                "УВ-32-57",
                "PY-S-8.jpg",
                "PY-S-8",
                "УВ-20-80",
                "B-13.png",
                "B-13",
                "Б-13");

        String Mi8MSBOzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8MSBOzbrJson);
        out.flush();
    }
}
