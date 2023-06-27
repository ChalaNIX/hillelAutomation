package ua.hillel.tests.locators17.homeworkwebelement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonsTable {
    @Test
    public void buttonsTable() {
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");


        //потрібно знайти і клікнути по кожній кнопці, після чого вибрати всі значення з 4го стовбця таблиці і вивести їх на екран
//        WebElement buttons = driver.findElement(By.xpath("//a[contains(@class,'button')"));
//        driver.findElement(buttons.findElement(By.xpath(By.xpath("[1]"))));
        driver.findElement(By.xpath("//a[contains(@class,'button')][1]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'button')][2]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'button')][3]")).click();

        WebElement table = driver.findElement(By.xpath("//table"));
        System.out.println(table.findElement(By.xpath("//tr[1]/td[4]")).getText());
        System.out.println(table.findElement(By.xpath("//tr[2]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[1]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[2]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[3]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[4]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[5]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[6]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[7]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[8]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[9]/td[4]")).getText());
        System.out.println(driver.findElement(By.xpath("//table//tr[10]/td[4]")).getText());



        driver.quit();
    }
}
