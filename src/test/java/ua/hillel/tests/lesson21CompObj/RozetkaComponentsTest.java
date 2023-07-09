package ua.hillel.tests.lesson21CompObj;

import org.testng.annotations.Test;
import ua.hillel.automation.java.pages.rozetka21.CatalogPage;
import ua.hillel.automation.java.pages.rozetka21.ItemPage;
import ua.hillel.automation.java.pages.rozetka21.RozMainPage;
import ua.hillel.tests.lesson20PageObjectsPageFactory.login.BaseTest;

//Selenium advanced - ComponentObject, CustomFactory, Singleton
//Таким чином Page Object виступає в ролі контейнеру функціоналу і буде об'єднувати різні блоки
//для того щоб надати кінцевий доступ до цього функціоналу тестам

//Другий принцип - однотипні ел-ти на сторінках можна розділити на окремі класи і описати окремо
//не потрібно вже давати публічний доступ
public class RozetkaComponentsTest extends BaseTest {
    @Test
    public void rozCompTest() {
        RozMainPage rozMainPage = new RozMainPage(driver);

        rozMainPage.header.search("Item");  //пошук товару з хедеру

        ItemPage itemPage = new ItemPage(driver);  //сторінка товару
        itemPage.header.goToMainPage();  //повернутись на початкову сторінку

        CatalogPage catalogPage = new CatalogPage(driver);

        String item1Name = catalogPage.getItemName(1);
        String item2Name = catalogPage.getItemName(2);

    }
}
