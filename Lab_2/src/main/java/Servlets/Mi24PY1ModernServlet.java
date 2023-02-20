package Servlets;

import Entity.Mi24PY1ModernEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24PY1ModernServlet")
public class Mi24PY1ModernServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24PY1ModernEntity story = new Mi24PY1ModernEntity(
                "Мі-24ПУ1",
                "Під час модернізації Мі-24 до рівня Мі-24ПУ1 роблять капітальний ремонт і ремоторизацію вертольоту (під час якої<BR>встановлюють два нових, потужніших двигуна ТВ3-117ВМА-СБМ1У-02 виробництва «Мотор Січ»), що дозволило<BR>збільшити висоту польоту (на 1500 м) і вантажопідйомність (на 1000 кг). Ресурс нових двигунів становить 12 000<BR> годин. Як повідомив в інтерв'ю глава департаменту розробок і закупки озброєнь та воєнної техніки міністерства оборони<BR>України Андрій Артюшенко, нові двигуни 'забезпечують можливість експлуатації вертольота за температур до+52<BR>градусів за Цельсієм'.",
                "Також встановлюють СОЕП «Адрос» КТ-01АВ, система збору і реєстрації політної інформації БУР-4-1-07,<BR>модернізований авіаційний стрілецький приціл АСП-17ВПМ-У (виробництва київського ЦКБ «Арсенал»), лазерна<BR>система формування прицільної марки ФПМ-01кв і замінюють систему освітлення кабіни з метою забезпечити<BR>можливість пілотування в окулярах нічного бачення (прилад нічного бачення встановлюється на шолом, тому<BR>вертоліт укомплектований шоломами нового зразка).",
                "ПТКР «Штурм-У» замінюють на розроблений ГККБ «Промінь» 130-мм ПТКР «Бар'єр-У».",
                "Пакет обладнання французького виробництва від SAGEM D.S. повинен був включати у себе багатофункціональний<BR>дисплей, прицільну станцію OLOSP 410, систему відео-аудіо реєстрації VS-1500, бортовий обчислювач,<BR>інерційно-супутникову систему навігації SIGMA 95L і генератор цифрової карти Mercator. У 2012 році був затверджений<BR>комплект обладнання у складі супутникової навігаційної системи GРS МАР-695, ультракороткохвильової радіостанції<BR>КY-196У, аварійного радіомаяку ЕВС-406АFНМ, а також радіолокаційного відповідача GТХ-327 з датчиком висоти АК-350.",
                "Після завершення ремонту і модернізації вертоліт отримує нове лакофарбове покриття.",
                "Вартість модернізації одного Мі-24П до рівня Мі-24ПУ1 станом на початок 2017 року становила 25 млн. гривень.");

        String Mi24PY1ModernJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24PY1ModernJson);
        out.flush();
    }
}
