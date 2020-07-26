package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(name = "Servlet14" , urlPatterns = {"/servlet14"})
public class Servlet14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Start: ");
        response.getWriter().println(request.getHeader("User-Agent")) ;
        response.getWriter().println(request.getHeader("Host")) ;
        response.getWriter().println(request.getRemoteAddr()) ;
        response.getWriter().println(request.getHeader("Connection")) ;


    }
}
