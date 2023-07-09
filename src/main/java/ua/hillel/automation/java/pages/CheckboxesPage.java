package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//Вивести стан чекбоксів. Відмітити обидва чекбокси. Тест за допомогою Page Objects і Page Factory

public class CheckboxesPage extends BasePage{
    //private By checkboxFirst = By.xpath("//input[contains(@type,'checkbox')][1]");
    //private By checkboxSecond = By.xpath("//input[contains(@type,'checkbox')][2]");
    @FindBy(xpath = "//input[contains(@type,'checkbox')][1]")
    private WebElement checkboxFirst;

    @FindBy(xpath = "//input[contains(@type,'checkbox')][2]")
    private WebElement checkboxSecond;

    public CheckboxesPage(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
    }

    //вивести на екран стан чекбоксу
    public void printCheckboxState(WebElement checkbox) {
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
    }
    public void printAllCheckboxesState() {
        printCheckboxState(checkboxFirst);
        printCheckboxState(checkboxSecond);
    }

    //вибрати чекбокс
    public void selectCheckbox(WebElement checkbox) {
        if(!checkbox.isSelected()) {
            checkbox.click();
        }
    }
    public void selectAllCheckboxes() {
        selectCheckbox(checkboxFirst);
        selectCheckbox(checkboxSecond);
    }

    public WebElement getCheckboxFirst() {
        return checkboxFirst;
    }

    public WebElement getCheckboxSecond() {
        return checkboxSecond;
    }
}
