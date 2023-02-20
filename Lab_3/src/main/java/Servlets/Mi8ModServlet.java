package Servlets;

import Entity.Mi8ModEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8ModServlet")
public class Mi8ModServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8ModEntity mod = new Mi8ModEntity(
                "Мі-8МТ",
                "Модернізація мала проходити в два етапи: до моделі зі збільшеним фюзеляжем планувався випуск<BR>оновленого гелікоптера з мінімальними змінами. Неможливість використання базових Мі-8 у<BR>високогірних районах та у країнах з жарким кліматом прискорила процес розробки нового<BR>гелікоптера, і вже у 1975 році пройшло перше випробування Мі-8МТ.",
                "Проект видався вдалим, завдяки покращеним показникам вантажопідйомності, швидкості набору<BR>висоти та практичної стелі. В 1977 році розгортається серійне виробництво Мі-8МТ в Казані.<BR>Необхідність використання подібного гелікоптера в Афганістані зробили його основним з лінійки<BR>Мі-8. У 1981 році Мі-8МТ був представлений на виставці Ле-Бурже, де йому був присвоєний<BR>міжнародний експортний індекс Мі-17, під яким він постачався за кордон (в СРСР Мі-8МТ).",
                "За другим етапом модернізації, який розпочався у 1977 році було збільшено розмір фюзеляжу за<BR>рахунок включення симетрично до центру тяжіння двох півметрових секцій. Це дозволило<BR>перевозити 29 десантників, 36 пасажирів і 18 поранених на ношах.");

        String Mi8ModJson = new Gson().toJson(mod);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8ModJson);
        out.flush();
    }
}
