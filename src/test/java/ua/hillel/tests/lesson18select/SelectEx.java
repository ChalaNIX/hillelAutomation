package ua.hillel.tests.lesson18select;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SelectEx {
    @Test
    public void selectTest() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");

        //select доступний тільки для елементу html select, якщо дропдаун з div - ні
        WebElement selectElement = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectElement);
        //значення value (опції) в дропдауні в html стабільні
        //отримати перелік опцій для подальшого порівняння
        List<String> selectedOptions = select.getAllSelectedOptions()
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        select.selectByValue("2");

        //evaluate - Alt+F8/в debug режимі справа




        driver.quit();
    }
}
