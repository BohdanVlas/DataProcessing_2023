package Servlets;

import Entity.HomeVstupEntity;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HomeVstupServlet")
public class HomeVstupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        HomeVstupEntity vstup = new HomeVstupEntity(
                "Збройні сили України - військове формування, завданням якого є захист сувернітету, територіальної цілісності і недоторканності та оборони України.<BR>Структурно поділене на 3 види та 3 окремі роди військ:",
                "Сухопутні війська<BR>Повітряні сили<BR>Військово-морські сили<BR>Десантно-штурмові війська<BR>Сили спеціальних операцій<BR>Сили територіальної оборони",
                "ЗСУ забезпечують охорону повітряного простору держави та підводного простору у межах територіального моря, стримування збройної агресії проти<BR>України та надання їй відсічі.",
                "В умовах сучасних збройних конфліктів, коли наявні засоби дальнього ураження, якими легко знищуються аеропорти і вся їх інфраструктура,<BR>ветрольоти витісняють літаки. Для зльоту, посадки і стоянки їм не потрібна ЗПС, а по варіативності виконуваних завдань вони не поступаються їм.",
                "SV.png",
                "SV",
                "Прапор СВ ЗСУ",
                "PS.png",
                "PS",
                "Прапор ПС ЗСУ",
                "VMS.png",
                "VMS",
                "Прапор ВМС ЗСУ",
                "DSH.png",
                "DSH",
                "Емблема десантно-штурмових військ ЗСУ",
                "SSO.png",
                "SSO",
                "Емблема ССО ЗСУ",
                "TRO.png",
                "TRO",
                "Емблема ТРО ЗСУ");
        String VstupJson = new Gson().toJson(vstup);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();
        out.print(VstupJson);
        out.flush();
    }
}
