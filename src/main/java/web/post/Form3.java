package web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form3", urlPatterns = {"/getForm3"})
public class Form3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page = request.getParameter("page");

        int number = Integer.parseInt(page);
        for (int i = 1; i != number; i++) {
            if (number % i == 0) {
                response.getWriter().println("DZIELNIK: "+i);
            }
        }


    }

}