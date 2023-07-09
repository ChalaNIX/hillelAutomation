package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDOMPage extends BasePage{
    private By firstButton = By.xpath("//a[contains(@class,'button')][1]");
    private By secondButton = By.xpath("//a[contains(@class,'button')][2]");
    private By thirdButton = By.xpath("//a[contains(@class,'button')][3]");
    private By forthColumn = By.xpath("//td[4]");


    public ChallengingDOMPage(WebDriver driver) {
        super(driver);
    }
    public void clickAllButtons() {
        clickButton(driver.findElement(firstButton));
        clickButton(driver.findElement(secondButton));
        clickButton(driver.findElement(thirdButton));
    }
    public void printForthColumn() {
        List<WebElement> elements = driver.findElements(forthColumn);
        for (WebElement element : elements) {
            String text = element.getText();
            System.out.println(text);
        }
    }
}
