package ua.hillel.tests.lesson18select.Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropdownIdealSolution {
    @Test
    public void Dropdown() throws InterruptedException {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(".dropdown")))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.cssSelector(".secondary-dropdown a[data-toggle]")))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.cssSelector(".dropdown-menu.secondary a")))
                .click()
                .perform();

        WebElement secondPageText = driver.findElement(By.xpath("//p[text()='Secondary action in the menu was clicked successfully!']"));
        Assert.assertTrue(secondPageText.getText().contains("Secondary action in the menu was clicked successfully!"));

        driver.quit();

    }
}
