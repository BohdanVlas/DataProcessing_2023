package Servlets;

import Entity.Mi14HistoryDetEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14HistoryDetServlet")
public class Mi14HistoryDetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14HistoryDetEntity story = new Mi14HistoryDetEntity(
                "Мі-14",
                "Фюзеляж Мі-14 виконаний за типом «амфібія» з двома надувними поплавцями бочкоподібної<BR>форми з боків (балонетами), об'ємом 4 куб. м. У процесі робіт конструкція Мі-8 зазнала<BR>суттєвих змін — по суті спроектовано новий вертоліт з потужнішими двигунами ТВ3-117<BR>(2200 к. с.), новим головним редуктором ВР-14, ДСУ Аі-9. Рульовий гвинт перенесений на<BR>іншу сторону (на відміну від Мі-8), що збільшило його ефективність. На вертольоті 4-х стоєчне<BR>шасі, яке прибирається в польоті",
                "Обладнання вертольота також зазнало значних змін. На протичовновому Мі-14ПЛ встановлені<BR>РЛС «Ініціатива 2-М», гідроакустична станція «Ока-2», що опускається, магнітний визначник<BR>АПМ-60, КВ радіостанція Р-842М, УКХ радіостанція Р-860, радіовисотомір РВ-Зх, радіокомпаси<BR>АРК-9 і АРК-У2, доплеровський вимірювач ДІСС-15, автопілот АП-34Б, система автоматичного<BR>управління САУ-14.",
                "У протичовновому варіанті вертольоти працюють парою. Один вертоліт<BR>виконує пошукові завдання і завантажується гідроакустичними буями РДБ-НМ (36 шт), а другий<BR>є ударним і завантажується протичовновою зброєю.",
                "Мі-14ПС несе 10 рятувальних плотів на <BR>20 місць кожен, рятувальну лебідку, здатну одночасно підняти трьох осіб, оснащений <BR>прожекторами. Також цей вертоліт може застосовуватися для транспортування вантажів на <BR>зовнішній підвісці, висадки морських десантів і просто для транспортних перевезень.");

        String Mi14StoryDetJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14StoryDetJson);
        out.flush();
    }
}
