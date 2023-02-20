package Servlets;

import Entity.Mi14HistoryEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14HistoryServlet")
public class Mi14HistoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14HistoryEntity story = new Mi14HistoryEntity(
                "Мі-14",
                "У середині шістдесятих років у Військово-морському флоті СРСР виникла<BR>гостра необхідність у спеціалізованому протичовновому вертольоті,<BR>побудованому на базі машини, котра себе добре зарекомендувала. Ним<BR>став Мі-14, побудований на базі вертольота Мі-8. Основні модифікації:<BR>Мі-14ПЛ — протичовновий, Мі-14ПС — рятувальний, Мі-14БТ — тральщик.",
                "Вертольоти Мі-14 — єдині радянські повноцінні вертольоти-амфібії, які дійсно<BR>можуть сідати, рулити і злітати з водної поверхні.",
                "Вдалі конструктивні рішення, розроблені для Мі-14, в подальшому використовувалися<BR>на інших вертольотах: Мі-8 та Мі-24");
        String Mi14StoryJson = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14StoryJson);
        out.flush();
    }
}
