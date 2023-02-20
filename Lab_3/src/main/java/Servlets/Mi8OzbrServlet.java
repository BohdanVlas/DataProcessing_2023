package Servlets;

import Entity.Mi8OzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8OzbrServlet")
public class Mi8OzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8OzbrEntity ozbr = new Mi8OzbrEntity(
                "Мі-8МТ",
                "На кожній фермі гелікоптера розміщується 3 вузли підвіски.",
                "До складу озброєння входять блоки НАР, зокрема НАРи: 55мм С-5, 80мм С-8, авіаційні фугасні,<BR>кластерні, напалмові та димові бомби калібрів: 250кг, або 500кг і баки із запальною сумішшю.",
                "Для запуску НАРів використовуються різноманітні ПУ:<BR>УВ-32-57, УВ-20-57, УВ-20-80",
                "НАРи: 55мм С-5, 80мм С-8, 240мм С-24Б",
                "УВ-32-57, УВ-20-80",
                "Фаб-250 та Фаб-500",
                "S-5_57mm.jpg",
                "S-5_57mm",
                "C-5",
                "S-8_80mm.jpg",
                "S-8_80mm",
                "C-8",
                "S-24B-240mm.jpg",
                "S-24B",
                "С-24Б",
                "PY-S-5.JPG",
                "PY-S-5",
                "УВ-32-57",
                "PY-S-8.jpg",
                "PY-S-8",
                "УВ-20-80",
                "FAB-250.JPG",
                "FAB-250",
                "ФАБ-250",
                "FAB-500.JPG",
                "FAB-500",
                "ФАБ-500");

        String Mi8OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8OzbrJson);
        out.flush();
    }
}
