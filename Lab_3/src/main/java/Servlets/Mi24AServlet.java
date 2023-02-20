package Servlets;

import Entity.Mi24AEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24AServlet")
public class Mi24AServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24AEntity story = new Mi24AEntity(
                "Мі-24А",
                "Проектування Мі-24 велося на основі транспортного вертольота Мі-8, що добре себе зарекомендував<BR>в експлуатації. Роботи з його створення очолив особисто Михайло Леонтійович Міль. Силова<BR>установка та динамічні системи були взяті від Мі-8 практично в незмінному вигляді, але<BR>п'ятилопатевий несучий гвинт серйозно доопрацювали, зменшивши в діаметрі, а хвостовий гвинт<BR>перенесли з правого на лівий бік хвостової балки. У 1971 році ударно-транспортний вертоліт Мі-24<BR>був запущений у серійне виробництво та прийнятий на озброєння Радянської Армії.",
                "На першій серійній модифікації стрілок-оператор і<BR>льотчик перебували у загальній кабіні, на<BR>наступних – за схемою «тандем» (кабіна<BR>стрільця-оператора перебуває попереду). Обидві<BR>кабіни герметизовані та обладнані системою<BR>кондиціонування повітря, що дає можливість<BR>вести бойові дії в умовах хімічного та радіаційного<BR>зараження місцевості та широкому діапазоні<BR>температур. Вантажна кабіна дозволяє розмістити<BR>вісім десантників зі штатним озброєнням та<BR>боєприпасами.",
                "Мі-24А — перша серійна модифікація",
                "Mi-24A_1.jpg",
                "Mi-24A",
                "Mi-24A");
        String Mi24AJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24AJson);
        out.flush();
    }
}
