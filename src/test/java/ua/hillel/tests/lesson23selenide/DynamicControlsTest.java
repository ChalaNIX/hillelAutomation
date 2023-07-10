package ua.hillel.tests.lesson23selenide;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import ua.hillel.automation.java.selenidePages.DynamicControlsPage;

import static com.codeborne.selenide.Selenide.open;

public class DynamicControlsTest {
    @Test
    public void dynamicControlsTest() {
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.timeout =10000;
        Configuration.savePageSource= false;

        Configuration.reportsFolder = "target/reports";
        Configuration.downloadsFolder ="target/downloads";

        open("/dynamic_controls");
        DynamicControlsPage controlsPage = new DynamicControlsPage();

        controlsPage.hideOrShowCheckbox(true); //сховати чекбокс

        controlsPage.hideOrShowCheckbox(false); //показати чекбокс
    }
}
