package ua.hillel.tests.lesson23selenide.hw;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UploadTest {
    @Test
    public void uploadTest() {
        open("https://the-internet.herokuapp.com/upload");
        SelenideElement fileInput = $(By.id("file-upload"));
        fileInput.click();
        File file = new File("/target/downloads/some-text.txt");
        fileInput.uploadFile(file);
        $("#file-submit").click();
    }
}
