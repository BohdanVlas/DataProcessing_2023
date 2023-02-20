package Servlets;

import Entity.Mi24PidvisneEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24PidvisneServlet")
public class Mi24PidvisneServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24PidvisneEntity pidvisne = new Mi24PidvisneEntity(
                "Підвісне озброєння",
                "На крилах гелікоптера розміщуються 6 вузлів підвіски, з яких два вузли можуть використовуватися<BR>виключно для підвісу ПТКРів.",
                "Серед підвісного озброєння є блоки НАР, зокрема НАРи: 55мм С-5,<BR>80мм С-8, 240мм С-24Б, ПТРК Штурм-В,керовані ракети класу<BR>'повітря-повітря' Р-60, Р-60М, авіаційні фугасні, кластерні, напалмові<BR>та димові бомби калібрів: 250кг, або 500кг та контейнери<BR>УПК-23-250 з 23-мм гарматою ГШ-23Л і 250 набоями.",
                "Для запуску НАРів використовуються різноманітні ПУ:<BR>УВ-32-57, УВ-20-57, УВ-20-80.",
                "Крайні вузли для підвісу виключно ПТКРів",
                "Mi-24(01).jpg",
                "Mi-24(01)",
                "Крайні вузли для підвісу виключно ПТКРів",
                "НАРи: 55мм С-5, 80мм С-8, 240мм С-24Б",
                "Фаб-250 та Фаб-500",
                "УВ-32-57 та УВ-20-80",
                "S-5_57mm.jpg",
                "S-5_57mm",
                "C-5",
                "S-8_80mm.jpg",
                "S-8_80mm",
                "C-8",
                "S-24B-240mm.jpg",
                "S-24B",
                "С-24Б",
                "FAB-250.JPG",
                "FAB-250",
                "ФАБ-250",
                "FAB-500.JPG",
                "FAB-500",
                "ФАБ-500",
                "PY-S-5.JPG",
                "PY-S-5",
                "УВ-32-57",
                "PY-S-8.jpg",
                "PY-S-8",
                "УВ-20-80");

        String Mi24PidvisneJson = new Gson().toJson(pidvisne);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24PidvisneJson);
        out.flush();
    }
}
