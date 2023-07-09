package ua.hillel.automation.java.pages.rozetka21.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {
    private WebDriver driver;

    @FindBy(css = ".search")
    private WebElement searchInput;
    public Header(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void goToMainPage() {
        //click logo
    }
    public void search(String criteria) {
        //send keys to search input
        searchInput.sendKeys(criteria);
    }
}
