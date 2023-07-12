package ua.hillel.automation.java.selenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    public void uploadFile(Path filePath) {
        File file = new File(filePath.toUri());

        SelenideElement fileInput = $("#file-upload");
        fileInput.sendKeys(file.getAbsolutePath());

        SelenideElement fileUploadButton = $("#file-submit");
        fileUploadButton.click();
    }
}
