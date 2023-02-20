package Servlets;

import Entity.Mi24PY1Entity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi24PY1Servlet")
public class Mi24PY1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi24PY1Entity story = new Mi24PY1Entity(
                "Мі-24ПУ1",
                "Український варіант модернізації радянського ударного вертольота Мі-24П",
                "Mi-24PY1(1)_1.jpg",
                "Mi-24PY1",
                "Мі-24ПУ1",
                "Mi-24PY1_1.png",
                "Mi-24PY1",
                "Мі-24ПУ1-модернізація");

        String Mi24PY1Json = new Gson().toJson(story);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi24PY1Json);
        out.flush();
    }
}
