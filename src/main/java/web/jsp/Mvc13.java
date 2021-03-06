package web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "Mvc13", urlPatterns = {"/mvc13"})
public class Mvc13 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/jsp3.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            try{
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                String isbn = request.getParameter("isbn");



                Book book = new Book(title,author,isbn);
                request.setAttribute("book",book);


                getServletContext().getRequestDispatcher("/jsp/jsp3.jsp").forward(request,response);

            } catch (Exception e){
                System.out.println("BŁĄD !!");
            }


    }
}
