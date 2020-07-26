package web.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get1" , urlPatterns = {"/get1"})
public class Get1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String startStr = request.getParameter("start");
        String endStr = request.getParameter("end");
        response.getWriter().println(startStr+"<br/>");
        response.getWriter().println("Start: "+endStr+"<br/>");
        response.getWriter().println("End: "+endStr+"<br/>");
        response.getWriter().println("<br/>");

        try {
            int start = Integer.parseInt(startStr);
            int end = Integer.parseInt(endStr);

            for (int i=start; i<=end; i++){
                response.getWriter().println(i+"<br/>");
            }
        } catch (NumberFormatException e){
            response.getWriter().println("Złe liczby");
        }


    }
}