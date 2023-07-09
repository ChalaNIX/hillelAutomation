package ua.hillel.automation.java.pages.rozetka21;

import org.openqa.selenium.WebDriver;
import ua.hillel.automation.java.pages.rozetka21.components.Header;

public class ItemPage {
    private WebDriver driver;
    public Header header;

    public ItemPage(WebDriver driver) {
        this.driver = driver;
        this.header = new Header(driver);
    }
}
