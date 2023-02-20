package Servlets;

import Entity.Mi8MSBHistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8MSBHistoryServlet")
public class Mi8MSBHistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8MSBHistoryEntity story = new Mi8MSBHistoryEntity(
                "Мі-8МСБ-В",
                "Під час модернізації Мі-8 до рівня Мі-8МСБ-В встановили турбовальні двигуни ТВ3-117ВМА-СБМ1В<BR>серії 4Е виробництва «Мотор Січ» з електронним запуском, частково посилили несучі елементи і<BR>реконструювали фюзеляж, встановили нову систему запуску двигуна. При цьому редуктор двигуна<BR>з пропускною спроможністю 2,5тис. кс збережений без змін.",
                "У ході випробувань було встановлено, що в разі виходу з ладу одного з двигунів, вертоліт здатний<BR>злетіти на одному двигуні в режимі перевантаження.",
                "Згідно з даними виробника, модернізація дозволяє продовжити льотний ресурс вертольота на 2 тис.<BR>льотних годин або 8 років експлуатації з можливістю подальшого продовження ресурсу вертольота<BR>до 16 років.",
                "Військовий вертоліт Мі-8МСБ-В у ході модернізації отримує додаткове обладнання: нові системи<BR>збору, реєстрації та обробки польотної інформації, аварійний радіомаяк, лазерна система<BR>формування прицільної марки ФПМ-01кв, станція оптико-електронного придушення «Адрос»,<BR>комбінований пристрій викиду теплових помилкових цілей «Адрос» КУВ 26-50, екранно-вихлопні<BR>пристрої АШ-01В для зниження температури і розсіювання потоків вихлопних газів. Крім того, на<BR>вертоліт можуть бути встановлені додаткові паливні баки.");

        String Mi8MSBStoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8MSBStoryJson);
        out.flush();
    }
}
