package web.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet(name = "Get3" , urlPatterns = {"/get3"})
public class Get3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

      String width = request.getParameter("width");
      String height = request.getParameter("width");


      if ("null".equals(width)){
          width = "5";
          response.getWriter().println("TEST");
      }
      if ("".equals(height)){
          height = "10";
      }


      try{
          int widthInt = Integer.parseInt(width);
          int heightInt = Integer.parseInt(height);
      } catch (NumberFormatException e) {
          response.getWriter().println("Błędne liczby");
      }

        response.getWriter().println("width: "+width+" height: "+height);

    }
}