package web.jsp;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private String isbn;
    static List<Book>  books = new ArrayList<Book>();


    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

     public static List<Book> addToList(Book book){

        books.add(book);

        return books;
    }

    public static void clearList(){
        books = new ArrayList<Book>();
    }


}
