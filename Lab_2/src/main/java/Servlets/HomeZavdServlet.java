package Servlets;

import Entity.HomeZavdEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HomeZavdServlet")
public class HomeZavdServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HomeZavdEntity zavd = new HomeZavdEntity(
                "Завдання вертольотів в кожному виді військ",
                "СВ ЗСУ",
                "Вогнева підтримка під час наступу чи контратаки та висадка десанта.",
                "ПС ЗСУ",
                "Розвідка, знищення бойової техніки та живої сили противника, вогнева підтримка під час наступу чи контратаки, висадка десанта і доставка особового<BR>складу.",
                "ВМС ЗСУ",
                "Протичовнова оборона флоту з базуванням на кораблях різного класу, виявлення сучасних підводних човнів та надводних цілей, передача данних<BR>про них на корабельні і берегові пункти, їх ураження із застосуванням бортових засобів ураження. Також виконання пошуково-рятувальних завданнь.");

        String ZavdJson = new Gson().toJson(zavd);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(ZavdJson);
        out.flush();
    }
}