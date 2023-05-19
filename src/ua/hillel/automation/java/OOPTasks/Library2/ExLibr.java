package ua.hillel.automation.java.OOPTasks.Library2;

public class ExLibr {
    public static void main(String[] args) {
        Book book0 = new Book("The Picture of Dorian Gray", "Oscar Wilde", 1890);
        Book book1 = new Book("The Little Prince", "Antoine de Saint-Exupéry", 1943);
        Book book2 = new Book("Da Vinci Code", "Dan Brown", 2003);
        Book book3 = new Book("Angels and Demons", "Dan Brown", 2000);

        Library library = new Library();
        library.addBook(book0);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.removeBook(book0);
        System.out.println(library.searchByTitle("The Little Prince"));
        System.out.println(library.searchByAuthor("Dan Brown"));

        System.out.println("All catalog:");
        System.out.println(library.displayCatalog());
        //System.out.println(library);



    }
}
