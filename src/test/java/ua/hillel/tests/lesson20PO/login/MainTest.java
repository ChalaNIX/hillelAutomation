package ua.hillel.tests.lesson20PO.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ua.hillel.automation.java.pages.MainPage;

public class MainTest {  //можна екстендитись від базового класу щоб підтягувались методи
    protected WebDriver driver;
    /*
    стандартний спосіб:
@BeforeSuite
public void startDriver() {
  WebDriverManager.chromedriver().setup();
  driver = new ChromeDriver();
  driver.manage().window().maximize();
}

@BeforeClass
public void setUp() {
  driver.get("https://the-internet.herokuapp.com/");
}

@AfterClass(alwaysRun = true)
public void cleanUp() {
  driver.manage().deleteAllCookies();
}

@AfterSuite(alwaysRun = true)
public void closeDriver(){
  driver.quit();
}
 */
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromiumdriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterClass(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

    public MainPage openApp() {
        driver.get("https://the-internet.herokuapp.com/");
        return new MainPage(driver);
    }
}
