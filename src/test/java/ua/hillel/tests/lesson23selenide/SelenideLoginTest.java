package ua.hillel.tests.lesson23selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.*;

//Selenide - обгортка над веб драйвером
//додати залежність через mvn repository
//є окремий клас Configuration - можна додати базовий URL
//не працює з вебелементи напряму - має обгортку для них - селеніделементи
//їх шукають коли ми з ними взаємодієм (а не коли оголошуєм)
public class SelenideLoginTest {
    @Test
    public void selenideLoginTest() throws FileNotFoundException {
        //Configuration.assertionMode - асерти (перевірки)
        //Configuration.baseUrl - основна урла відносно якої можна open відносний шлях
        //Configuration.browser - по дефолту хром
        //Configuration.browser = "firefox";
        //Configuration.browserCapabilities - налаштування дефолтної папки завантажень файлів- але у селеніда є своя дефолтна папка
        //Configuration.downloadsFolder - переналаштування дефолтної папки для завантаження файлів
        //дефолтна папка для селеніду - в корні проєкту папка build
        Configuration.downloadsFolder ="target/downloads";
        //Configuration.clickViaJs -яким чином клікати по кнопкам/посиланням. по дефолту - false. true означає що кліки будуть по JS а не звичайні
        //Configuration.fastSetValue - як sendkeys, другий спосіб, присвоєення значень, краще sendkeys
        //Configuration.headless -запуск тестів не відкриваючи браузер
        //Configuration.holdBrowserOpen- по дефолту у нас 1 потік.якщо true - браузер в кінці тесту не буде закриватись
        //Configuration.remote - для запуску на віддаленому оточені
        //Configuration.savePageSource -збереження html сторінки де впав тест(рідко)
        Configuration.savePageSource = false;
        //Configuration.screenshots -збереження скріна сторінки де впав тест. зберігає в свою папку build
        //можна отримати посилання на скріншот і додати його в репорт
        //Configuration.timeout - дефолтний 4 секунди
        Configuration.timeout = 10;
        open("https://the-internet.herokuapp.com/");

        $(By.linkText("Form Authentication")).click();

        //щоб знайти колекцію елементів - отримаємо об'єкт який є обгорткою над цією колекцією
        //$$("#username");
        //ElementsCollection elements = $$("#username");
        //elements.filter()  - фільтрувати по тому чи відображається елемент, має текст, має ще щось

        //xpath
        //$x("//input");
        //xpath колекція
        //$$x("//input");
        //інші локатори
        //$(By.linkText(""));


        //так можна створювати поля для Page Objects, не потрібні анотації
        SelenideElement username = $("#username");
        //механізм очікувань - багато методів should
        //username.should()
        username.should(Condition.exist)
                .should(Condition.visible)
                .shouldHave(Condition.text("test"))
                .clear();
        username.sendKeys("tomsmith");

        SelenideElement passwordInput = $x("//input[@id='password']");
        passwordInput.clear();
        passwordInput.sendKeys("SuperSecretPassword!");

        $(".radius").click();


        //Actions
        //actions().moveToElement()
        //JavaScript
        //executeJavaScript()


        //завантаження файлів з сторінки
        SelenideElement fileLink = $("#fileLink");
        fileLink.click(); //стандартне завантаження
        fileLink.download(); //повертає завантажений файл, чекає поки завантажиться
        //завантаження файлів на сторінку
        fileLink.uploadFile();
        //спрощено завантаження з і на сторінку файлу:
        File file = fileLink.download();
        fileLink.uploadFile(file);




    }
}
