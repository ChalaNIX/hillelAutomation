package ua.hillel.tests.lesson18actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;



public class RozetkaTestIdeal {
    private WebDriver driver;
    private WebDriverWait wait;

    @Test
    public void rozetkaTest() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rozetka.com.ua/ua/");
        //очікування
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fat-menu"))).click();

        Actions actions = new Actions(driver);

        List<WebElement> menuItems = driver.findElements(By.cssSelector(".menu-categories__item"));
        for (WebElement item : menuItems) {
            if (item.getText().equals("Товари для геймерів")) {
                actions.moveToElement(item).pause(1)
                        .moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Комплектуючі для геймерів')]/..//a[@class='menu__link' and contains(text(), 'Відеокарти')]")))
                        .click()
                        .perform();
                break;
            }
        }
        //метод для спрощення фільтрації
        selectFilter("Rozetka");
        selectFilter("ASUS");
        selectFilter("GeForce RTX 4090");



        List<WebElement> cards = driver.findElements(By.cssSelector("li.catalog-grid__cell"));

        for (WebElement card : cards) {
            String avail = card.findElement(By.cssSelector(".goods-tile__availability")).getText();
            if (avail.equals("Є в наявності")) {
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;

                javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", card);
                javascriptExecutor.executeScript("arguments[0].click()", card.findElement(By.tagName("a")));
                break;
            }
        }


    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }


    private void selectFilter(String filter) {
        driver.findElement(By.cssSelector(String.format("a[data-id='%s']", filter))).click();
        //очікування, кастомним методом waitForFilterApplied()
        wait.until(ExpectedConditions.not(waitForFilterApplied()));
    }



    private ExpectedCondition<Boolean> waitForFilterApplied() {
    /*
    return new ExpectedCondition<Boolean>() {
      @Override
      public Boolean apply(WebDriver webDriver) {
        WebElement mainElement = driver.findElement(By.xpath("//main"));
        return mainElement.getAttribute("class").contains("preloader_type_element");
      }
    };
     */


        return webDriver -> {
            WebElement mainElement = driver.findElement(By.xpath("//main"));
            return mainElement.getAttribute("class").contains("preloader_type_element");
        };
    }

}
