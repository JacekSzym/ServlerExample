package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GetCookies" , urlPatterns = {"/getCookies"})
public class GetCookies  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

       Cookie[] cookies = request.getCookies();

       for(Cookie cookie : cookies ){

           if (cookie.getName().equals("User")){
               response.getWriter().println(cookie.getName()+" : "+cookie.getValue());
           }
       }


    }

}