package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteCookie", urlPatterns = {"/deleteCookie"})
public class DeleteCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] Cookie = request.getCookies();
        Boolean deleted = false;
        int count = 0;

        if (Cookie != null) {
            for (Cookie cookie : Cookie) {
                    cookie.setMaxAge(0);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    deleted = true;
                    count++;
            }
        }
            if (deleted) {
                response.getWriter().println("Usunięto "+count+" ciasteckza");
            } else {
                response.getWriter().println("Nie znaleziono żadnych ciastek");
            }
        }
    }
