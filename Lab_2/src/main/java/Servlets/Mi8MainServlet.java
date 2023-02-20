package Servlets;

import Entity.Mi8MainEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi8MainServlet")
public class Mi8MainServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi8MainEntity main = new Mi8MainEntity(
                "Мі-8МТ",
                "Мі-8(Hip за класифікацією НАТО)",
                "Мі-8 - радянський багатоцільовий вертоліт, розроблений ОКБ М. Л. Міля на початку<BR>1960-х років. Наймасовіший у світі вертоліт із двома двигунами, один із наймасовіших<BR>вертольотів в історії авіації. Широко використовується для виконання багатьох цивільних<BR>і військових завдань.",
                "Mi-8(2-1).jpg",
                "Mi-8",
                "Mi-8");

        String Mi8MainJson = new Gson().toJson(main);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi8MainJson);
        out.flush();
    }
}
