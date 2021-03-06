package web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Mvc11", urlPatterns = {"/mvc11"})
public class Mvc11 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try {
            String role = request.getParameter("role");
            role = role.toUpperCase();
            role = "ROLE_" + role;

            request.setAttribute("UserRole", role);

        } catch (NullPointerException e){
            response.getWriter().println("Błąd");
        }


        getServletContext().getRequestDispatcher("/jsp/jsp1.jsp").forward(request,response);


    }
}
