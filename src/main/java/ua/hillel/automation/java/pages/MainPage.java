package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    //private WebDriver driver; //змінна без значення. значення передається з тесту за допомогою конструктора


    /*
        public void openAuthPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
    }
     */
    public LoginPage openAuthPage() {
        clickButton(driver.findElement(By.linkText("Form Authentication")));
        //driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage();
    }
    public DownloadPage openDownloadPage(){
        clickButton(driver.findElement(By.linkText("File Download")));
        return new DownloadPage();
    }
}
