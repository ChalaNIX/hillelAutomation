package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
//в Page objects перевірки (Assert) не використовуються

public class LoginPage extends BasePage{
    //private WebDriver driver;
//    private By usernameLocator = By.id("username"); //сюди не можемо писати напряму WebElement тому що є динамічні елементи, які виникають після якоїсь дії (повідомлення про помилку)
//    private By passwordLocator = By.id("password");
//    private By loginButtonLocator = By.cssSelector(".radius");

    //Page Factory - винесення локаторів як поля
    @FindBy(id = "username")   //не забути додати фабрику в конструкторі класу
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".radius")
    private WebElement loginButton;

    @FindBy(css = ".flash.error")
    private WebElement errorPopup;

    //варіації анотацій
    @FindBy(css = "")
    List<WebElement> list;

    //@FindBys - знайти декілька
    //@FindAll
    public LoginPage() {
        //super(driver);
        super();
        //this.driver=driver;
        PageFactory.initElements(driver, this); //драйвер і посилання на клас
        //будуть створенні проксі елементи і драйвер буде шукати їх тільки коли ми будемо до них звертатися
    }
    public LoginPage setUserName(String username) {
        //WebElement userNameEl = driver.findElement(usernameLocator);

//        userNameEl.clear();
//        userNameEl.sendKeys(username);
        setFieldValue(usernameInput,username);
        return this; //LoginPage
    }
    public LoginPage setPassword(String password) {
        //WebElement passwordEl = driver.findElement(passwordLocator);
        setFieldValue(passwordInput,password);
        return this;
    }
    public SecurePage clickLoginButton() {  //метод дублюється нижче бо різні результати при введелені валідних/невалідних данних (різні сторінки повертаються)
        //driver.findElement(loginButtonLocator).click();
             //clickButton(driver.findElement(loginButtonLocator));
        clickButton(loginButton);
        return new SecurePage();
    }

    public LoginPage loginWithInvalidCreds() {
        clickButton(loginButton);
        return this;
    }

    public String getErrorText() {
        return errorPopup.getText();
    }
    public SecurePage login(String username, String password) {
        setUserName(username);
        setPassword(password);
       return clickLoginButton();
    }
}
