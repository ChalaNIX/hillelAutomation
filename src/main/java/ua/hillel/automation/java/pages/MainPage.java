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
    public CheckboxesPage openCheckboxesPage(){
        clickButton(driver.findElement(By.linkText("Checkboxes")));
        return new CheckboxesPage(driver);
    }
    public HoversPage openHoversPage() {
        clickButton(driver.findElement(By.linkText("Hovers")));
        return new HoversPage(driver);
    }
    public ChallengingDOMPage openChallengingDOMPage() {
        clickButton(driver.findElement(By.linkText("Challenging DOM")));
        return new ChallengingDOMPage(driver);
    }
    public UploadPage openUploadPage(){
        clickButton(driver.findElement(By.linkText("File Upload")));
        return new UploadPage();
    }
}
