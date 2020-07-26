package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cookie3" , urlPatterns = {"/cookie3"})
public class cookie3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");
        int time = Integer.parseInt(request.getParameter("time"))*3600;

        if(key != null || value != null || key.length() !=0 || key.length() != 0){
            Cookie cookie = new Cookie(key,value);
            cookie.setPath("/");
            cookie.setMaxAge(time);
            response.addCookie(cookie);
        }

        response.getWriter().println("Dodano ciecho: "+key+" o waeroscj: "+value);

    }

}