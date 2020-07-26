package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SetCookie" , urlPatterns = {"/setCookie"})
public class SetCookie extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie cookie = new Cookie("User","CodersLab");

        response.addCookie(cookie);


        response.getWriter().println("Cistko założone");

    }

}