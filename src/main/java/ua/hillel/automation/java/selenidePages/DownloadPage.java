package ua.hillel.automation.java.selenidePages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DownloadPage {
    public void downloadFile(SelenideElement fileLink) throws FileNotFoundException {
        fileLink.download();
    }
    public void editFile(Path filePath, String newContent) throws IOException {
        File usersFile = new File(filePath.toUri());
        List<String> lines = new ArrayList<>();
        lines.add("abra");
        lines.add("cadabra");
        lines.add(newContent);
        Files.write(usersFile.toPath(),lines, StandardOpenOption.APPEND);
    }
}
