package ua.hillel.automation.java.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Path;

import static com.codeborne.selenide.Selenide.$;

public class UploadPage {
    private SelenideElement fileUploadedtext = $(By.xpath("//*[@id='content']/div/h3"));

    public SelenideElement uploadFile(File file) {

        SelenideElement fileInput = $("#file-upload");
        fileInput.sendKeys(file.getAbsolutePath());

        SelenideElement fileUploadButton = $("#file-submit");
        fileUploadButton.click();
        fileUploadedtext.shouldBe(Condition.visible);
        return fileUploadedtext;
    }
}
