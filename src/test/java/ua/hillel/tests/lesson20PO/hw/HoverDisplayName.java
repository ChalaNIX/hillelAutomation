package ua.hillel.tests.lesson20PO.hw;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.HoversPage;

public class HoverDisplayName extends BasicClass {
    @Test
    public void Dropdown() {

        openApp().openHoversPage();
        HoversPage hoversPage = new HoversPage(driver);

        Assert.assertTrue(hoversPage.getFirstImageTitles().contains("name: user1"));
        Assert.assertTrue(hoversPage.getSecondImageTitles().contains("name: user2"));
        Assert.assertTrue(hoversPage.getThirdImageTitles().contains("name: user3"));


    }
}
