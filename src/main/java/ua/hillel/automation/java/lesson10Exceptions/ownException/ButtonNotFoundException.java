package ua.hillel.automation.java.lesson10Exceptions.ownException;

public class ButtonNotFoundException extends RuntimeException{
    public ButtonNotFoundException (String name, String locator) {
        super("Button "+ name + " was not found; locator: " + locator);
        //check ExPage
    }
}
