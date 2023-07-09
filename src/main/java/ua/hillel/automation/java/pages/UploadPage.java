package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Path;

public class UploadPage extends BasePage{
    public UploadPage() {
        super();
    }

    //File Upload
    public void uploadFile(Path filePath) {
        File file = new File(filePath.toUri());

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(file.getAbsolutePath());

        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();
    }
}
