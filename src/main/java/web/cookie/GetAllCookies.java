package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetCookies" , urlPatterns = {"/getCookies"})
public class GetAllCookies extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       Cookie[] cookies = request.getCookies();

       if (cookies != null) {

           for (Cookie cookie : cookies) {

                   response.getWriter().println(cookie.getName() + " : " + cookie.getValue());
               }

       } else {
           response.getWriter().println("Nie ma ciastek do wyświetlenia");
       }

    }

}