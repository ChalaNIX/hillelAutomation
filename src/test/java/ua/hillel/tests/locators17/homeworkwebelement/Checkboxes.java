package ua.hillel.tests.locators17.homeworkwebelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test
    public void checkboxes() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //вивести на екран початковий стан чекбоксів (вибраний чи ні), потім вибрати обидва.

        WebElement checkboxFirst = driver.findElement(By.xpath("//input[contains(@type,'checkbox')][1]"));
        WebElement checkboxSecond = driver.findElement(By.xpath("//input[contains(@type,'checkbox')][2]"));

        System.out.println(checkboxFirst.isSelected());
        System.out.println(checkboxSecond.isSelected());

        if(!checkboxFirst.isSelected()) {
            checkboxFirst.click();
        }
        if(!checkboxSecond.isSelected()) {
            checkboxFirst.click();
        }

        Assert.assertTrue(checkboxFirst.isSelected());
        Assert.assertTrue(checkboxSecond.isSelected());
    }
}
