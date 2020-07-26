package web.post;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Form5", urlPatterns = {"/post5"})
public class Form5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method = request.getParameter("convertionType");
        Double degrees = Double.parseDouble(request.getParameter("degrees"));

        response.getWriter().println("Temperatura w Farenhaitach: "+ method);

        if ("FahrToCelc".equals(method) ){
            degrees = ((degrees - 32) / 2 ) * 1.1;
            response.getWriter().println("Temperatura w Celcjuszach: "+ degrees);
        } else if ("celcToFahr".equals(method)){
            degrees = 2*(degrees-0.1*degrees) + 32;
            response.getWriter().println("Temperatura w Farenhaitach: "+ degrees);
        }



    }


}
