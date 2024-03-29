package ua.hillel.tests.lesson20PO.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ua.hillel.automation.java.pages.MainPage;
import ua.hillel.automation.java.utilis21.DriverHolder;
import ua.hillel.tests.listeners.CustomExtendReportListener;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Listeners({CustomExtendReportListener.class})
public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromiumdriver().setup();

        //налаштування завантаження файлів (4 сроки)
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/downloads").getAbsolutePath()); //target бо mvn її очищає після кожного запуску
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options); //options передаються якщо ми налаштовували зберігання файлів (як вище)
        driver.manage().window().maximize();

        DriverHolder.setDriver(driver);
    }
    @AfterClass(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage();
    }
}
