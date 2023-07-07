package ua.hillel.tests.lesson19waits;

/*
Якщо паузу робимо Thread.sleep() то виконучи тести в декілька потоків один може розбудити інші
Тому використовуємо в останню чергу
Краще використовувати режим очікування
в manage є 3 таймаути (це очікування елементів, те що елемент присутній не значить що з ним вже можна взаємодіяти)
імплісіт - неявні очікування (краще не використовувати)
явні очікування - перевіряє і стан і наявність

будь які очікування треба використовувати обережно, тільки де ми знаєм що варто почекати

коли вантажиться сторінка, html підсвічує елементи що міняються. і можна подивитись на їх атрибути,
деякі з них будуть присутні тільки під час процесу завантаження - так його і можна відловити
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitTest {
    @Test
    public void waitTest(){
        WebDriverManager.chromiumdriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //поки не з'явиться локатор - повертає ВебЕлемент
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id"))).click();
        //колекція елементів
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("id")));
        //знаходження вкладеного елемента
        //wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy());
        //перевірити що елемент клікабельний
        wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
        //елемент обраний
        wait.until(ExpectedConditions.elementToBeSelected(By.id("")));
        //ExpectedConditions.visibilityOf... - група методів перевірки чи не прихований
        //ExpectedConditions.invisibility -дочекатися поки елемент буде прихованим
        //ExpectedConditions.textToBePresent -текст присутній
        //ExpectedConditions.textToBePresentInElementValue - для текстовий полів
        //ExpectedConditions.attributeContains - атрибут і його значення
        //для негативних сценаріїв, дочекатися алерту
        wait.until(ExpectedConditions.alertIsPresent()).accept(); //натиснути окей
        wait.until(ExpectedConditions.alertIsPresent()).dismiss(); //натиснути кенсел
        wait.until(ExpectedConditions.alertIsPresent()).getText();
        //wait.until(ExpectedConditions.alertIsPresent()).sendKeys(); - якщо є атрибути для введення додаткової інфи
        //очікування фрейму:
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(""));
        //можна комбінувати. спочатку що присутній, потім що активний, потім ще щось...







    }
}
