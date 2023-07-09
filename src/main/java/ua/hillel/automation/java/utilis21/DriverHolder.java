package ua.hillel.automation.java.utilis21;

import org.openqa.selenium.WebDriver;

public class DriverHolder { //тепер під час створення нашого драйверу в тестах його треба покласти в DriverHolder
    //і потім отримуємо доступ до драйверу через DriverHolder

    //реалізація в package ua.hillel.automation.java.pages.BasePage;  (можна знайти по пошуку)
    private static DriverHolder instance;

    private WebDriver driver;

    private DriverHolder() {}

    public static DriverHolder getInstance() {
        if (instance == null) {
            instance = new DriverHolder();
        }
        return instance;
    }

    public static void setDriver(WebDriver driver) {  //зберегти посилання на драйвер
        getInstance().driver = driver;
    }

    public static WebDriver getDriver() { //дістати посилання на драйвер
        return getInstance().driver;
    }
}
