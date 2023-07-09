package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//вивести всі імена юзерів, які відображаються при наведені на зображення
//за допомогою Page Object

public class HoversPage extends BasePage{
    private By avatar1 = By.xpath("(//img[@alt='User Avatar'])[1]");
    private By avatar2 = By.xpath("(//img[@alt='User Avatar'])[2]");
    private By avatar3 = By.xpath("(//img[@alt='User Avatar'])[3]");
    private By avatar1Title = By.xpath("//h5[text()='name: user1']");
    private By avatar2Title = By.xpath("//h5[text()='name: user2']");
    private By avatar3Title = By.xpath("//h5[text()='name: user3']");
    Actions actions = new Actions(driver);
    public HoversPage(WebDriver driver) {
        super();
    }
    public void hoverOverWebElement(WebElement image) {
        actions.moveToElement(image).perform();
    }

    public String getFirstImageTitles() {
        hoverOverWebElement(driver.findElement(avatar1));
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(avatar1Title)));
        return driver.findElement(avatar1Title).getText();

    }
    public String getSecondImageTitles() {
        hoverOverWebElement(driver.findElement(avatar2));
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(avatar2Title)));
        return driver.findElement(avatar2Title).getText();
    }
    public String getThirdImageTitles() {
        hoverOverWebElement(driver.findElement(avatar3));
        webDriverWait.until(ExpectedConditions.visibilityOf(driver.findElement(avatar3Title)));
        return driver.findElement(avatar3Title).getText();
    }

}
