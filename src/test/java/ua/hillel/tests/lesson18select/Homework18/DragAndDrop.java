package ua.hillel.tests.lesson18select.Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
/*
https://crossbrowsertesting.github.io/drag-and-drop.html - написати тест, який буде перетаскувати елементи
і перевіряти результат (що текст "Dropped!" відображається)
 */
public class DragAndDrop {
    private WebDriver driver;
    @Test
    public void DragAndDrop() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        driver.manage().window().maximize();

        WebElement targetToDrag = driver.findElement(By.xpath("//div[@id= 'draggable']"));
        WebElement targetToDrop = driver.findElement(By.xpath("//div[@id= 'droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(targetToDrag,targetToDrop).perform();



        WebElement textDropped = driver.findElement(By.xpath("//p[contains(text(), 'Dropped!')]"));
        Assert.assertTrue(textDropped.getText().contains("Dropped!"));

    }
    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
