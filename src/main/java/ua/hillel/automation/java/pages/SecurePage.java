package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage extends BasePage{
    //private WebDriver driver;

    public SecurePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage logout() {
        clickButton(driver.findElement(By.cssSelector("a.button")));
        //driver.findElement(By.cssSelector("a.button")).click();
        return new LoginPage(driver);
    }
    public String getTitle() {
        return driver.findElement(By.xpath("//h2")).getText();
    }
}
