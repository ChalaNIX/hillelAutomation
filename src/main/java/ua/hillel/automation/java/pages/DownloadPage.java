package ua.hillel.automation.java.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadPage extends BasePage{
    @FindBy(linkText = "some-file.txt")
    private WebElement fileLink;

    public DownloadPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    public void downloadFile(){
        fileLink.click();
    }

    public void editFile(String filePath, String newContent) {
        // Логіка редагування файлу
        // Ваш код для редагування файлу
    }
}
