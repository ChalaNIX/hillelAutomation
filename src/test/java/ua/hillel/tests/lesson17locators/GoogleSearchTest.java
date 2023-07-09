package ua.hillel.tests.lesson17locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    @Test
    public void googleSearchTest(){
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        WebElement searchArea = driver.findElement(By.cssSelector("[name='q']"));
        searchArea.clear();
        searchArea.sendKeys("Selenium Webdriver" + Keys.ENTER);
        WebElement searchResultLink = driver.findElement(By.xpath("//span/em"));
        Assert.assertTrue(searchResultLink.getText().contains("Selenium"));

        driver.quit();

    }
}
