package ua.hillel.tests.lesson20PO.hw;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.CheckboxesPage;

public class Checkboxes extends BasicClass {
    @Test
    public void checkboxes() {

        //вивести на екран початковий стан чекбоксів (вибраний чи ні), потім вибрати обидва.
        openApp().openCheckboxesPage();
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.printAllCheckboxesState();
        checkboxesPage.selectAllCheckboxes();

        //checkboxesPage.checkAllAreSelected();

        Assert.assertTrue(checkboxesPage.getCheckboxFirst().isSelected());
        Assert.assertTrue(checkboxesPage.getCheckboxSecond().isSelected());

    }
}
