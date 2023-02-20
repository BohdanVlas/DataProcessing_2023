package Servlets;

import Entity.Mi8HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8HistoryServlet")
public class Mi8HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8HistoryEntity story = new Mi8HistoryEntity(
                "Мі-8МТ",
                "Розробка проекту модернізованого гелікоптера Мі-8М зі збільшеною потужністю силової<BR>установки і вантажопідйомністю почалась ще в 1967 році в бригаді ОКБ-329.",
                "Основною метою було поліпшення характеристик, зокрема збільшення корисного навантаження до<BR>понад 4 тони та висотних характеристик, за якими він поступався не тільки іноземним аналогам, а й<BR>власному попереднику – Мі-4. Цього планувалося досягнути за рахунок встановлення нового двигуна<BR>ТВЗ-117, потужністю 1900 к.с., який призначався для протичовнової амфібії Мі-14 і Мі-24.",
                "Також було доцільним уніфікувати трансмісію, гвинти та двигун для всіх трьох апаратів. Крім того,<BR>мало відбутися оснащення апарату допоміжною установкою АІ-9 зі стартером-генератором та<BR>рульовим гвинтом зворотнього обертання. Дякуючи зміні направлення обертання, при якому нижня<BR>лопасть йшла вперед, назустріч потоку від несучого гвинта і збільшення хорди лопастей, ефективність<BR>керування значно зросла.",
                "Вертоліт Мі-8 є світовим рекордсменом за кількістю модифікацій.",
                "Може бути озброєний носовим та кормовим ККТ, а також “ЕВУ”, пристрій викиду ХТЦ та дипольних<BR>відбивачів“АСО-2В”(під хвостовою балкою), і станцією оптико-електронних перешкод “Липа”. Серед<BR>устаткування присутні: радіостанції “Баклан-20” і “Ядро-1”, радіокомпаси АРК-15М і АРК-УД,<BR>доплерівський вимірювач швидкості і зносу ДИСС-32-90, авіагоризонти АГК-77 і АГК74В,<BR>радіовисотомір Ф-037, навігаційна система А-723, метеорадіолокатор 8А-813.");

        String Mi8StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8StoryJson);
        out.flush();
    }
}
