package ua.hillel.automation.java.selenidePages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {
    //https://the-internet.herokuapp.com/dynamic_loading
    //private SelenideElement hiddenElementLink =$("#a[href=/dynamic_loading/1]");
    private SelenideElement hiddenElementLink=$(By.xpath("//*[@id='content']/div/a[1]"));
    private SelenideElement renderedElementLink =$(By.xpath("//*[@id='content']/div/a[2]"));
    private SelenideElement startButton =$(By.xpath("//*[@id='start']/button"));
    private SelenideElement loader =$(By.xpath("//*[@id='loading']/img"));
    private SelenideElement welcomeText =$(By.xpath("//*[@id='finish']/h4"));

    public void showHiddenElement(){
        hiddenElementLink.click();
        //start button
        startButton.shouldBe(Condition.visible)
                .shouldBe(Condition.enabled);
        startButton.click();
        //loader
        loader.shouldBe(Condition.visible)
                .shouldNotBe(Condition.visible);
        //text
        welcomeText.shouldBe(Condition.visible);
    }
    public void showRenderedElement(){
        renderedElementLink.click();
        //start button
        startButton.shouldBe(Condition.visible)
                .shouldBe(Condition.enabled);
        startButton.click();
        //loader
        loader.shouldBe(Condition.visible)
                .shouldNotBe(Condition.visible);
        //text
        welcomeText.shouldBe(Condition.visible);
    }
}
