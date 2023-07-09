package ua.hillel.automation.java.pages.rozetka21;

import org.openqa.selenium.WebDriver;
import ua.hillel.automation.java.pages.rozetka21.components.Header;

public class RozMainPage {
    private WebDriver driver;
    public Header header;  //публічне поле

    public RozMainPage(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
    }
}
