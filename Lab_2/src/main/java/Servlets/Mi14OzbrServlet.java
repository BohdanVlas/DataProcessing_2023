package Servlets;

import Entity.Mi14OzbrEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Mi14OzbrServlet")
public class Mi14OzbrServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Mi14OzbrEntity ozbr = new Mi14OzbrEntity(
                "Мі-14",
                "Мі-14ПЛ та Мі-14ПЛМ можуть бути озброєні протичовновими<BR>торпедами, глибинними бомбами та пошуковими буями як на<BR>зовнішніх вузлах підвіски, так і всередині грузового відділення.",
                "AT-1M",
                "AT-1M.jpg",
                "AT-1M",
                "AT-1M");

        String Mi14OzbrJson = new Gson().toJson(ozbr);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(Mi14OzbrJson);
        out.flush();
    }
}
