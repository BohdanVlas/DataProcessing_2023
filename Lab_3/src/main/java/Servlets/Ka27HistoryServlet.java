package Servlets;

import Entity.Ka27HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka27HistoryServlet")
public class Ka27HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka27HistoryEntity story = new Ka27HistoryEntity(
                "Ка-27",
                "Корабельний протичовновий вертоліт типу Ка-27/28 призначений для вирішення завдань<BR>протичовнової оборони флоту з базуванням на кораблях різного класу. Він здатний виявляти<BR>сучасні підводні човни та надводні цілі, передавати дані про них на корабельні і берегові<BR>пункти, а також атакувати їх з застосуванням бортових засобів ураження.",
                "Призначений для пошуку, відстеження та ураження підводних човнів у підводному і надводному<BR>положеннях, в денний і нічний час, у простих і складних метеоумовах на глибинах їх занурення<BR>до 500 метрів і швидкостях ходу до 75км/год, у районах, віддалених від місця базування<BR>вертольота до 200км. Оснащений радіолокаційною прицільно-пошуковою системою «Восьминіг»,<BR>гідроакустичною відкидною станцією, магнетометром.",
                "Може нести касети з гідроакустичними буями, торпеди, глибинні і орієнтирні бомби. Зазначені<BR>завдання виконуються при польотах з сухопутних аеродромів і з палуби корабля при<BR>хвилюванні моря до 5 балів.",
                "Один вертоліт Ка-27 базується на фрегаті «Гетьман Сагайдачний».");

        String Ka27StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka27StoryJson);
        out.flush();
    }
}
