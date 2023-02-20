package Servlets;

import Entity.Mi24HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24HistoryServlet")
public class Mi24HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24HistoryEntity story = new Mi24HistoryEntity(
                "Мі-24П",
                "Мі-24П - це модифікація радянського багатоцільового вертольота Мі-24, яка серійно<BR>випускалася з 1981 по 1989 роки. Основною відмінністю вертольота від попередніх<BR>модифікацій була заміна турелі з великокаліберним кулеметом ЯкБ-12,7 на авіаційну<BR>гармату ГШ-30К, яка жорстко закріплювалася на правому борту фюзеляжу.",
                "Призначення Мі-24 - підтримка наземних військ, знищення бронетанкової техніки<BR>супротивника, висадка десанту, транспортування вантажів, евакуація поранених,<BR>боротьба з вертольотами противника. Його концепція передбачала тісну<BR>взаємодію з бронетанковими та піхотними частинами в умовах бойових дій.",
                "Живучість вертольота непогана. Життєво-важливі компоненти вертольота Мі-24П<BR>продубльовані та захищені сталевими листами. Завдяки цьому він може<BR>витримати в лобову проекцію чергу з 7,62 мм кулемету, а іноді, навіть, чергу з<BR>великокаліберних кулеметів. Бронювання також може захистити від випадкового<BR>влучання з великокаліберних гармат, але не більше.");
        String Mi24StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24StoryJson);
        out.flush();
    }
}
