package ua.hillel.tests.lesson22files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.tests.lesson20PO.login.BaseClass;

public class FileDownload extends BaseClass {
    @Test
    public void fileDownload() {
        driver.get("https://the-internet.herokuapp.com/download");

        //файли качаються в дефолтну папку Завантаження, а не в папку проекту
        WebElement fileLink = driver.findElement(By.linkText("fileUploadTest.txt"));
        fileLink.click(); //ПКМ на папці таргет - Reload from Disk

        System.out.println("done");

    }
}
