package ua.hillel.tests.lesson18select.Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void Dropdown() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        WebElement dropdown = driver.findElement(By.xpath("//li[@class='dropdown']"));
        dropdown.click();

        ////a[@class='dropdown-toggle']
        WebElement firstMenu =driver.findElement(By.partialLinkText("Secondary Menu"));
        firstMenu.click();
        Thread.sleep(200);
        WebElement secondMenu = driver.findElement(By.xpath("//a[@onclick='handleSecondaryAction()']"));
        secondMenu.click();
        Thread.sleep(200);
        WebElement secondPageText = driver.findElement(By.xpath("//p[text()='Secondary action in the menu was clicked successfully!']"));
        Assert.assertTrue(secondPageText.getText().contains("Secondary action in the menu was clicked successfully!"));

        driver.quit();

    }
}
