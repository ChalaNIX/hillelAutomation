package ua.hillel.automation.java.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DownloadPage extends BasePage{
//    @FindBy(linkText = "some-file.txt")
//    private WebElement fileLink;

    public DownloadPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    public void downloadFile(WebElement fileLink){
        fileLink.click();
    }

    public void editFile(Path filePath, String newContent) throws IOException {
        File usersFile = new File(filePath.toUri());
        List<String> lines = new ArrayList<>();
        lines.add("abra");
        lines.add("cadabra");
        lines.add(newContent);
        Files.write(usersFile.toPath(),lines,StandardOpenOption.APPEND);
    }

}
