package ua.hillel.tests.lesson22files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.tests.lesson20PO.login.BaseClass;

import java.io.File;

public class FileUploadTest extends BaseClass {
    @Test
    public void uploadTest() {
        //форма для завантаження має текстове поле/input і type=file. і коли ми натискаєм - відкривається директорія щоб вибрати файл
        //вебдрайвер не вміє працювати з такими вікнами (що відкриваються при виборі файлу з ПК для завантаження на сайт)
        //потрібно ввести шлях до файлу в цей input
        driver.get("https://the-internet.herokuapp.com/upload");

        File file = new File("target/downloads/fileUploadTest.txt");

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(file.getAbsolutePath());

        //додати метод який перевіряє чи існує файл в такій то папці, якщо ні - треба ще почекати (коли великі файли)
        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();

    }
}
