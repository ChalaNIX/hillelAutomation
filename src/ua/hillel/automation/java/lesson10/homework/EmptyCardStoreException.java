package ua.hillel.automation.java.lesson10.homework;

public class EmptyCardStoreException extends RuntimeException {
    public EmptyCardStoreException() {
        super("Cardstore is empty. Try again later");
    }
}
