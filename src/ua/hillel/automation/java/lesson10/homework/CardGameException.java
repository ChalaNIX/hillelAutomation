package ua.hillel.automation.java.lesson10.homework;

public class CardGameException extends RuntimeException {
    public CardGameException() {
        super("Cardstore is empty. " +
                "Try again later");
    }
}
