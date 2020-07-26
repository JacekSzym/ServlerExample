package web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc12", urlPatterns = {"/mvc12"})
public class Mvc12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       try {

            Integer  start = Integer.parseInt(request.getParameter("start"))*10;
            Integer  end = Integer.parseInt(request.getParameter("end"))*10;

            System.out.println(start+" "+end);


            request.setAttribute("start",start );
            request.setAttribute("end", end );

            getServletContext().getRequestDispatcher("/jsp/jsp2.jsp").forward(request,response);

        } catch (Exception e){
          e.printStackTrace();
        }

//      response.getWriter().println(end+" "+start);


      //  getServletContext().getRequestDispatcher("/jsp/jsp2.jsp").forward(request,response);


    }
}
