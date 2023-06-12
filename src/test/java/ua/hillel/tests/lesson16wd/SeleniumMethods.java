package ua.hillel.tests.lesson16wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.naming.ldap.LdapReferralException;

public class SeleniumMethods {
    @Test
    public void seleniumMethods() throws InterruptedException{
        WebDriverManager.chromiumdriver().setup();

        WebDriver driver = new ChromeDriver();

        //відкрити браузер
        driver.get("https://www.instagram.com");
        //назва вікна/вкладки
        System.out.println(driver.getTitle());

        //методи manage - налаштування перед перевірками
        //deleteAllCookies() - щоб не перевідкривати браузерну сесію, використовувати обережно
        driver.manage().deleteAllCookies();
        //logs рідко, якщо були помилки в консолі
        driver.manage().logs();
        //driver.manage().timeouts(). - глобальні, краще не використовувати взагалі
        //driver.manage().window() - керування вікном. слідкувати щоб всюди був один і той же розмір
        driver.manage().window().maximize();
        //навігація. краще не використовувати.
        //крім оновлення сторінки - можна
        driver.navigate().refresh();
        //переходи між сторінками. частіше використовують driver.get
        driver.navigate().to("page");
        //switchTo - набір методів для переключення між чимось
        //switchTo().window - зробити вікно активним (активне може бути тільки одне)
        driver.switchTo().window("");
        //браузерна подія - alert(js) - допомагає хендлити
        driver.switchTo().alert();
        //iframe - сторінка в сторінці(ще один html документ). між ними треба переключатися. бо драйвер не бачить html в html
        //від них стараються відмовлятись, але ще є: платіжні системи і т.д.
        driver.switchTo().frame(0);
        driver.switchTo().parentFrame();
        //повернути поточне значення url
        driver.getCurrentUrl();
        //найчастіше використовуються
        //driver.findElement();
        Thread.sleep(2000);
        //закрити активну вкладку не закриваючи бінарний драйвер
        driver.close();
        //закрити браузер
        driver.quit();

        //driver.getTitle(); NoSuchSessionException бо бінарний драйвер вже закритий

    }
}
