package ua.hillel.tests.lesson18actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class RozetkaTest {
    //драйвер перед класом, щоб потім зробити афтер дію і закрити драйвер в кінці (незалежно від результату тесту)
    private WebDriver driver;

    @Test
    public void rozetkaTest() {
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua/");

        driver.findElement(By.id("fat-menu")).click();

        Actions actions = new Actions(driver);

        //perform - в кінці кожного action
        //actions важко дебажити. вони потрібні для імітації поведінки користувача яка тригерить js
        //actions.click() - без аргументів - клік по місцю де зараз знаходиться курсор. з аргументом - по центру прямокутника з вебелементом
        //actions.clickAndHold() - старий спосіб для того щоб перетащити + інші дії
        //actions.dragAndDrop() -  перетащити елемент
        //actions.contextClick() - клік ПКМ
        //actions.doubleClick() -2 різних кліка не підходить (js на елементі буде заважати)
        //переведення курсора
        //actions.moveToElement()
        //        actions.keyDown() - клавіша на клавіатурі
        //        WebElement element1 = driver.findElement(By.id("1"));
        //        WebElement element2 = driver.findElement(By.id("2"));
        //        //perform запускає цю цепочку дій
        //        actions.moveToElement(element1).clickAndHold(element1).moveToElement(element2).pause(Duration.ofSeconds(2)).release().perform(); //перетащити елемент
        List<WebElement> menuItems = driver.findElements(By.cssSelector(".menu-categories_item"));
        for (WebElement item : menuItems) {
            if (item.getText().equals("Товари для геймерів")) {
                actions.moveToElement(item).pause(1)
                        //локатор не правильний. не працює
                        .moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Комплектуючі для геймерів')]/..//a[@class='menu_link' and contains(text(), 'Відеокарти')]"))).click().perform();
                break;
            }
        }
        //можна виконувати код js на сторінці, потрібен js екзек'ютор
        driver.get("https://hard.rozetka.com.ua/ua/videocards/c80087/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[data-id='Rozetka']")).click();
        driver.findElement(By.cssSelector("a[data-id='ASUS']")).click();
        driver.findElement(By.cssSelector("a[data-id='GeForce RTX 4090']")).click();


        //клік js - це подія js. відбувається навіть якщо елемент прихований. тому використовується в крайніх випадках
        List<WebElement> cards = driver.findElements(By.cssSelector("li.catalog-grid_cell"));


        //не працює
        for (WebElement card : cards) {
            String avail = card.findElement(By.cssSelector(".goods-tile_availability")).getText();
            if (avail.equals("Є в наявності")) {
                JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

                javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", card); //проскролити до елементу
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
}
