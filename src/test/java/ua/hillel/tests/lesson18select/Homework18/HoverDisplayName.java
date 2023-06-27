package ua.hillel.tests.lesson18select.Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverDisplayName {
    @Test
    public void Dropdown() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/hovers");
        Actions actions = new Actions(driver);
        //user1
        WebElement avatar1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        actions.moveToElement(avatar1).perform();
        WebElement avatar1Text = driver.findElement(By.xpath("//h5[text()='name: user1']"));
        Assert.assertTrue(avatar1Text.getText().contains("name: user1"));

        //user2
        WebElement avatar2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));
        actions.moveToElement(avatar2).perform();
        WebElement avatar2Text = driver.findElement(By.xpath("//h5[text()='name: user2']"));
        Assert.assertTrue(avatar2Text.getText().contains("name: user2"));

        //user3
        WebElement avatar3 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[3]"));
        actions.moveToElement(avatar3).perform();
        WebElement avatar3Text = driver.findElement(By.xpath("//h5[text()='name: user3']"));
        Assert.assertTrue(avatar3Text.getText().contains("name: user3"));

        driver.quit();
    }
}
