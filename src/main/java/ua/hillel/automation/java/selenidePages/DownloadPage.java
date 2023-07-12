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
    File file;
    public File downloadFile(SelenideElement fileLink) throws FileNotFoundException {
        file = fileLink.download();
        return file;
    }
    public File editFile(File file, String newContent) throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("abra");
        lines.add("cadabra");
        lines.add(newContent);
        Files.write(file.toPath(),lines, StandardOpenOption.APPEND);
        return file;
    }
}
