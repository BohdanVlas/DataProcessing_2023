package Servlets;

import Entity.Mi24PY1HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24PY1HistoryServlet")
public class Mi24PY1HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24PY1HistoryEntity story = new Mi24PY1HistoryEntity(
                "Мі-24ПУ1",
                "У 2007 році міністерство оборони України заключило з Конотопським авіаремонтним заводом договір про розробку<BR>програми модернізації бойового вертольота Мі-24 для збройних сил України (ОКР «Helicopter»), співвиконавцями котрої<BR>стали ОАО «Мотор Січ», ГККБ «Промінь», НПФ «Адрон», ЦКБ «Арсенал», Ізюмський приладобудівний завод і французька<BR>компанія «SAGEM D.S.». Програма передбачала «двохрівневу модернізацію» вертольота із використанням агрегатів<BR>французького та українського виробництва.28 серпня 2008 року завод представив демонстраційний зразок вертольота<BR>Мі-24П, на котрий були встановлені двигуни ТВ3-117ВМА-СБМ1У виробництва ОАО «Мотор Січ». Надалі, вертоліт був<BR>направлений на державні випробування. У січні 2012 року за участі французької компанії «SAGEM D.S.» був виготовлений<BR>перший модернізований бойовой вертоліт Мі-24П (бортовий номер '01'), котрий був прийнятий на озброєння української<BR>армії у травні 2012 року під найменуванням Мі-24ПУ1. 25 травня 2012 року на озброєння Збройних сил України, після<BR>глибокої модернізації, було прийнято гелікоптер Мі-24ПУ1. У червні 2014 року на Конотопському авіаремонтному заводі<BR>перебували три вертольоти Мі-24ПУ1. За офіційними даними міністерства оборони України, опублікованими у довіднику<BR>'Біла книга України', у 2014 році збройним силам передали один вертоліт Мі-24ПУ1, котрий надійшов у ПС ЗСУ. У<BR>жовтні 2016 року всі три дослідних ексземпляри були передані у війська. 26 жовтня 2021 року державне підприємство<BR>«Конотопський авіаремонтний завод «АВІАКОН», передало армійській авіації Сухопутних військ ЗСУ чергову партію<BR>відремонтованих і серійно модернізованих вертольотів Мі-24ПУ1. Це відбулося в рамках виконання державного оборонного<BR>замовлення. На вертольоти встановили модернізовані вітчизняні системи озброєння та авіаційні приціли, системи захисту<BR>від ПЗРК і двигуни з поліпшеними характеристиками. Техніку вперше оснащено м’якими паливними баками та лопатями<BR>несучого гвинта українського виробництва.");

        String Mi24PY1HistoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24PY1HistoryJson);
        out.flush();
    }
}
