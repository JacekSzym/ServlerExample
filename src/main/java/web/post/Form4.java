package web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form4", urlPatterns = {"/post4"})
public class Form4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int a = Integer.parseInt(request.getParameter("a") );
        int b = Integer.parseInt(request.getParameter("b") );
        int c = Integer.parseInt(request.getParameter("c") );

        double delta  = b*b-4*a*c;

        if (delta <0 ){
            response.getWriter().println("Delta mniejsza od zera");
        } else if (delta == 0) {
           double  x1 = -b/2*a;
            response.getWriter().println("Jedno miesjce zerowe: "+x1);
        } else {

            double sqrt_delta = Math.sqrt(delta);
            double x1 = (-b-sqrt_delta)/2*a;
            double x2 = (-b+sqrt_delta)/2*a;

            response.getWriter().println("Dwa mijesca zerowe: "+x1+" oraz: "+x2);

        }



    }

}