package web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Mvc14", urlPatterns = {"/mvc14"})
public class Mvc14 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/jsp/jsp4.jsp").forward(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            try{
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                String isbn = request.getParameter("isbn");
                String delete = request.getParameter("delete");

                if ("delete".equals(delete)){
                    Book.clearList();
                    getServletContext().getRequestDispatcher("/jsp/jsp4.jsp").forward(request,response);

                } else {

                    Book book = new Book(title, author, isbn);
                    List<Book> listBooks = Book.addToList(book);

                    request.setAttribute("book", book);
                    request.setAttribute("listBooks", listBooks);

                    getServletContext().getRequestDispatcher("/jsp/jsp4.jsp").forward(request, response);
                }
            } catch (Exception e){
                System.out.println("BŁĄD !!");
            }


    }
}
