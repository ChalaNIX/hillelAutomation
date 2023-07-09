package ua.hillel.tests.lesson20PO.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.automation.java.pages.MainPage;
import ua.hillel.automation.java.utilis21.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class BasicClass {
    protected WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromiumdriver().setup();

        driver = new ChromeDriver(); //options передаються якщо ми налаштовували зберігання файлів
        driver.manage().window().maximize();

        DriverHolder.setDriver(driver);
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage();
    }
}
