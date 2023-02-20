package Servlets;

import Entity.Mi24KursoveEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24KursoveServlet")
public class Mi24KursoveServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24KursoveEntity kursove = new Mi24KursoveEntity(
                "Курсове озброєння",
                "Основним озброєнням Мі-24П є авіаційна двоствольна<BR>автоматична 30-мм гармата ГШ-30К (Грязєва-Шипунова)<BR>з боєкомплектом 250 набоїв. Живлення - стрічкове.<BR>Швидкострільність складає 2598 пострілів/хвилину. Ця<BR>гармата чудово справляється зі знищенням авіації та<BR>легкоброньованих наземних цілей. Однак варто<BR>враховувати, що гармата жорстко закріплена і<BR>наведення виконується за допомогою корпусу.",
                "Гармата має наступну номенуклатуру боєприпасів:<BR>Б - бронебійний каморний набій<BR>БТ - бронебійний-трасуючий набій<BR>ОФЗТ - осколково-фугасний запальний трасуючий набій",
                "ГШ-30К на німецькому Мі-24",
                "Mi-24(GSH-30K).jpg",
                "Mi-24(GSH-30K)",
                "Mi-24(ГШ-30K)");

        String Mi24KursoveJson = new Gson().toJson(kursove);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24KursoveJson);
        out.flush();
    }
}
