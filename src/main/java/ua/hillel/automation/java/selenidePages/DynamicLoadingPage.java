package ua.hillel.automation.java.selenidePages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPage {
    //https://the-internet.herokuapp.com/dynamic_loading
    private SelenideElement hiddenElementLink =$("#a[href=/dynamic_loading/1]");
    private SelenideElement renderedElementLink =$("#a[href=/dynamic_loading/2]");
    private SelenideElement startButton =$("#start > button");
}
