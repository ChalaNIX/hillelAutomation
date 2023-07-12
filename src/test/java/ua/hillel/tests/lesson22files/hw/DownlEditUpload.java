package ua.hillel.tests.lesson22files.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.DownloadPage;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DownlEditUpload extends MainCl {
    @Test
    public void downEditUpload() throws IOException {
        openApp().openDownloadPage();
        DownloadPage downloadPage = new DownloadPage();
        WebElement fileLink = driver.findElement(By.linkText("some-file.txt"));
        Path filePath = Paths.get("target/downloads/some-file.txt");
        //download
        downloadPage.downloadFile(fileLink);
        //change
        downloadPage.editFile(filePath,"lalala");
        //upload
        openApp().openUploadPage().uploadFile(filePath);
    }
}
