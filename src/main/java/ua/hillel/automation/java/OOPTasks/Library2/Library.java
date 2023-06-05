package ua.hillel.automation.java.OOPTasks.Library2;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public List searchByTitle(String request) {
        List<Book> books = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getTitle().contains(request)) {
                books.add(book);
            }
        }
        return books;
    }

    public List searchByAuthor(String request) {
        List<Book> books = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getAuthor().contains(request)) {
                books.add(book);
            }
        }
        return books;
    }

    public String displayCatalog() {

        return catalog.toString();
    }

    @Override
    public String toString() {
        return "Library{" +
                "catalog=" + catalog +
                '}';
    }
}
