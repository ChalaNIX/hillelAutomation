package ua.hillel.tests.lesson23selenide.hw;

import org.testng.annotations.Test;
import ua.hillel.automation.java.selenidePages.DynamicLoadingPage;

import static com.codeborne.selenide.Selenide.open;

public class DynamicLoadingTest extends ConfigurationClass{
    //https://the-internet.herokuapp.com/dynamic_loading
    @Test
    public void dynamicLoadingTest(){
        open("/dynamic_loading");
        DynamicLoadingPage loadingPage = new DynamicLoadingPage();

        //showHiddenElement();
        //showRenderedElement();
    }
}
