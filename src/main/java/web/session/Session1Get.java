package web.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Session1Get", urlPatterns = "/session1Get")
public class Session1Get extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

       try {
           int counter = (int) session.getAttribute("counter");
           counter++;
           session.setAttribute("counter",counter);
           response.getWriter().append("Counter: "+counter);
       } catch (NullPointerException e){
           response.getWriter().append("NONE");
       }




    }

}
