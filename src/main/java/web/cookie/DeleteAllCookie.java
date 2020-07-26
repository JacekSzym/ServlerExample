package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteAllCookies", urlPatterns = {"/deleteAllCookies"})
public class DeleteAllCookie extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] Cookie = request.getCookies();
        Boolean deleted = false;

        if (Cookie != null) {
            for (Cookie cookie : Cookie) {
                if (cookie.getName().equals("User")) {
                    cookie.setMaxAge(0);
                    cookie.setPath("/ServletExample_war_exploded");
                    response.addCookie(cookie);
                    deleted = true;
                    break;
                }
            }
        }
            if (deleted) {
                response.getWriter().println("Usunięto Ciasteczko");
            } else {
                response.getWriter().println("Nie znaleziono Ciasteczka");
            }
        }
    }
