package Servlets;

import Entity.Mi2MSBHistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi2MSBHistoryServlet")
public class Mi2MSBHistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi2MSBHistoryEntity story = new Mi2MSBHistoryEntity(
                "Мі-2МСБ",
                "Сертифікат розробника даного вертольота компанія «Мотор Січ» отримала в 2011 році, в квітні<BR>2013 року почалися його випробування і підготовка до серійного виробництва. 4 липня 2014<BR>року було здійснено перший політ.",
                "На вертоліт Мі-2МСБ встановлюють сучасний двигун АІ450М (розроблений ДП «Івченко-Прогрес»<BR>і виробляється на ПАТ «Мотор Січ») потужністю 465 к.с., частково встановлена нова авіоніка, що<BR>кардинально відрізняє його від Мі-2. Це абсолютно інша машина за всіма характеристиками: шуму,<BR>паливної економічності на висоті, вантажопідйомність стала в рази вище. Максимальна швидкість<BR>- 250 км на годину.",
                "Також внесено зміни до бортового обладнання: дообладнано систему управління (встановлюється нова<BR>панель управління з рідкокристалічними моніторами виробництва київського ВАТ НТК<BR>«Електронприлад»), встановлено станцію супутникової GPS-навігації СН-4312У, аварійний радіомаяк<BR>ARTEX C406-1НМ, сигнал зледеніння СО-121ВМ та прилад реєстрації польотних даних БУР-4-1-07-02.",
                "Військова машина, що була прийнята на озброєння України вже в 2015 році. Легкий ударний вертоліт<BR>призначений для виконання оперативно-тактичних завдань в інтересах підрозділів Збройних Сил,<BR>боротьби з живою силою і бронетехнікою противника. Планується, що МСБ-2МО матиме версії<BR>протитанкову, розвідувальну та корабельного базування.");

        String StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(StoryJson);
        out.flush();
    }
}
