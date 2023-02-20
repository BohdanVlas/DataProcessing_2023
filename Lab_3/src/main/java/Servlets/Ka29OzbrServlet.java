package Servlets;

import Entity.Ka29OzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Ka29OzbrServlet")
public class Ka29OzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ka29OzbrEntity ozbr = new Ka29OzbrEntity(
                "Ка-29",
                "Ка-29 є носієм не лише стрілецько-гарматного озброєння та протитанкових комплексів. До складу<BR>озброєння входять також підвісні пускові установки некерованих ракет калібром 57 та 80мм.<BR>На пілонах вертольота можуть підвішуватися також баки із запальною сумішшю.",
                "Курсове озброєння",
                "Основним озброєнням Ка-29 є чотириствольний авіаційний кулемет 9-A-622 калібру 7,62 мм в<BR>рухомій установці з боєзапасом 1800 патронів.",
                "Підвісне озброєння",
                "На фермах гелікоптера розміщуються 4 вузли підвіски.",
                "Серед підвісного озброєння є блоки НАР, зокрема НАРи: 55мм С-5, 80мм С-8, ПТРК Штурм-В з ПТКР<BR>'Кокон' або 'Атака', ЗБ-500 та контейнери УПК-23-250 з 23-мм гарматою ГШ-23Л і 250 набоями.",
                "ЗБ-500",
                "ZB-500.png",
                "ZB-500",
                "ЗБ-500");
        String Ka29OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Ka29OzbrJson);
        out.flush();
    }
}
