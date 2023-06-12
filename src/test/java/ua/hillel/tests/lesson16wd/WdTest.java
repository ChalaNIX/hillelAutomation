package ua.hillel.tests.lesson16wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WdTest {
    @Test
    @Parameters({"browser"})
    public void wbTest(String browser) throws InterruptedException{
        WebDriver driver =null;
        if (browser.equalsIgnoreCase("ff")) {
            WebDriverManager.firefoxdriver().setup(); //автоматичне налаштування версії і т.д.

            driver = new FirefoxDriver(); //WebDriver - це універсальний інтерфейс
        }else if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromiumdriver().setup();

            driver = new ChromeDriver();
        }


        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);
        driver.quit();
        //браузер теж може бути параметром для testNG
    }
}
