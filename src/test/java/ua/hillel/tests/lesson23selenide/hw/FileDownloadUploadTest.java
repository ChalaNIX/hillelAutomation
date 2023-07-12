package ua.hillel.tests.lesson23selenide.hw;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.selenidePages.DownloadPage;
import ua.hillel.automation.java.selenidePages.UploadPage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FileDownloadUploadTest extends ConfigurationClass {
    //https://the-internet.herokuapp.com/download
    //https://the-internet.herokuapp.com/upload
    @Test
    public void downloadUploadTest() throws IOException {
        open("/download");
        DownloadPage downloadPage = new DownloadPage();

        SelenideElement fileLink = $(By.linkText("some-file.txt"));
        //Path filePath = Paths.get("target/downloads/some-file.txt");
        //download
        File downloadedFile = downloadPage.downloadFile(fileLink);
        //change
        downloadPage.editFile(downloadedFile,"lalala");
        //upload
        open("/upload");
        UploadPage uploadPage = new UploadPage();
        SelenideElement fileUploadedText = uploadPage.uploadFile(downloadedFile);
        Assert.assertEquals(fileUploadedText.getText(),"File Uploaded!","File is not uploaded");
    }
}
