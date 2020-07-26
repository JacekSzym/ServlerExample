package web.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Session2", urlPatterns = "/session2")
public class Session2 extends HttpServlet {

    final static String HTMLCODE = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Session2</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<h3> Formularz ocen </h3>\n" +
            "\n" +
            "\n" +
            "<form action=\"session2\" method=\"POST\">\n" +
            "    <input type=\"text\" name=\"grade\" />\n" +
            "    <input type=\"submit\" />\n" +
            "</form>\n" +
            "\n" +
            "\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(HTMLCODE);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().println(HTMLCODE);

        HttpSession session = request.getSession();

        if (session.isNew() ){
            List<Integer> gradesInSession = new ArrayList<Integer>();
            session.setAttribute("gradesInSession", gradesInSession);
        }

        List<Integer> gradesInSession = (List<Integer>) session.getAttribute("gradesInSession");

        try {
            int i = Integer.parseInt(request.getParameter("grade"));
            gradesInSession.add(i);
        } catch (Error e ){
            response.getWriter().append("Błąd wprowadzonej liczby");
        }

        response.getWriter().println(gradesInSession.toString());
        response.getWriter().println(getAvg(gradesInSession));

    }

    protected double getAvg (List<Integer> list){

        double sum = 0;
        double count = 0;


        for (Integer i : list){
            sum = sum + (double) i;
            count++;
        }

        double avg = sum/count;

        return avg;

    }

}
