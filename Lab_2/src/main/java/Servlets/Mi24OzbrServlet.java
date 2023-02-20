package Servlets;

import Entity.Mi24OzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24OzbrServlet")
public class Mi24OzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24OzbrEntity ozbr = new Mi24OzbrEntity(
                "Мі-24П",
                "Мі - 24 є носієм не лише стрілецько-гарматного<BR>озброєння та протитанкових комплексів. До<BR>складу озброєння входять також підвісні пускові<BR>установки некерованих ракет калібром<BR>57, 80 та 240 мм.",
                "На пілонах вертольота можуть підвішуватися<BR>також авіабомби різного призначення калібром<BR>до 500 кілограм і баки із запальною сумішшю.",
                "Чеський Мі-24П з підвішеними 4 ПУ УВ-32-57 і 4 ПТКР",
                "Mi-24(PY_S_5).jpg",
                "Mi-24(PY_S_5)",
                "Mi-24(PY_S_5)");

        String Mi24OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24OzbrJson);
        out.flush();
    }
}
