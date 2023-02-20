package Servlets;

import Entity.Ka29HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka29HistoryServlet")
public class Ka29HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka29HistoryEntity story = new Ka29HistoryEntity(
                "Ка-29",
                "Транспортно-бойовий вертоліт створювався за програмою переозброєння морської піхоти, зокрема сучасними<BR>засобами доставки. При створенні вертольота враховувався бойовий досвід морської піхоти ймовірного супротивника,<BR>насамперед корейської та в'єтнамської воєн.",
                "Вертоліт розроблявся на базі створюваного на той час протичовнового та пошуково-рятувального Ка-27.",
                "Перший політ прототипу з бортовим номером «208», що мав позначення Ка-252ТБ, відбувся 28 липня 1976 року.",
                "Гелікоптер Ка-29 призначений для тривалого базування на кораблі, тому в конструкції широко застосовуються<BR>антикорозійні матеріали. Силова установка та трансмісія не відрізняються від Ка-27.",
                "Основною зовнішньою відмінністю Ка-29 від Ка-27 є розширена на 500 мм носова частина кабіни з трьома плоскими<BR>бронесклом замість двох подвійної кривизни у останнього.",
                "Вертоліт Ка-29 може експлуатуватися у двох основних варіантах: транспортному або бойовому, та призначений для<BR>десантування з кораблів підрозділів морської піхоти, перевезення вантажів, військової техніки на зовнішній підвісці, а<BR>також вогневої підтримки морської піхоти, знищення живої сили, техніки та берегових укріплень противника . Може<BR>бути використаний для медичної евакуації, перекидання особового складу, вантажів з плавбаз та суден постачання<BR>на бойові кораблі.",
                "У транспортному варіанті гелікоптер здатний взяти на борт до 16 десантників з особистою зброєю, або 10 поранених,<BR>включаючи чотирьох на ношах, або до 2000 кг вантажу в транспортній кабіні, або до 4000 кг вантажу на зовнішній<BR>підвісці. На гелікоптері може бути встановлена ​​лебідка вантажопідйомністю до 300 кг. Доступ десанту у вантажну<BR>кабіну виконаний через двоє двостулкових дверей зліва та праворуч фюзеляжу.");

        String Ka29StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka29StoryJson);
        out.flush();
    }
}
