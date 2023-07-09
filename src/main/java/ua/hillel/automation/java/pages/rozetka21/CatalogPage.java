package ua.hillel.automation.java.pages.rozetka21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ua.hillel.automation.java.pages.rozetka21.components.Header;
import ua.hillel.automation.java.pages.rozetka21.components.ItemCard;

import java.util.List;
//getItemName - в цьому варіанті головне знайти батьківський елемент щоб в ньому вже шукати

public class CatalogPage {
    private WebDriver driver;
    public Header header;

    private List<WebElement> items;  //колекція карток товарів

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
        header = new Header(driver);
    }

    public String getItemName(int itemNum) {   //пошук назви товару по номеру
        WebElement item = items.get(itemNum-1);  //пошук елемента обгортки. itemNum-1 бо ПК рахує з нуля
        return new ItemCard(item).getTitle(); //знаходимо вкладені елементи в класі обгортці
    }
}
