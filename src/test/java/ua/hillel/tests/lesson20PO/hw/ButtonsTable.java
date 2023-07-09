package ua.hillel.tests.lesson20PO.hw;

import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.ChallengingDOMPage;
//потрібно знайти і клікнути по кожній кнопці, після чого вибрати всі значення
//з 4го стовбця таблиці і вивести їх на екран
//тест за допомогою Page objects
public class ButtonsTable extends BasicClass {
    @Test
    public void buttonsTable() {

        openApp().openChallengingDOMPage();
        ChallengingDOMPage challengingDOMPage = new ChallengingDOMPage(driver);

        challengingDOMPage.clickAllButtons();

        challengingDOMPage.printForthColumn();


    }
}
