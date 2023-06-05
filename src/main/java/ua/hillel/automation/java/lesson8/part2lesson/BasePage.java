package ua.hillel.automation.java.lesson8.part2lesson;

public class BasePage {
    protected String param;

    //конструктор
    public BasePage(String baseParam) {
        this.param = baseParam;
        System.out.println("Base Page created");

    }
}
