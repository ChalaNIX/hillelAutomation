package ua.hillel.automation.java.pages.rozetka21.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//винесення однотипних карток з товарами з розетки в окремий клас
public class ItemCard {
    private WebElement parent;  //пошук через батьківський елемент тому драйвер не потрібен

    @FindBy(css = ".title")
    private WebElement title;

    @FindBy(xpath = ".//span[@class='price']") //крапка значить починати шукати з конкретного місця а не з будь якого (можна з батьківскього parent наприклад
    //тобто якщо від локатора викликаєм ще раз find element то шлях треба обов'язково починати з крапки. а потім вже //
    private WebElement price;

    public ItemCard(WebElement element) {
        parent = element;
        PageFactory.initElements(element, this); //пошук елементів за допомогою PageFactory
    }

    public String getTitle() { //назва товару
        return title.getText();
    }

    public String getPrice() {
        return price.getText();
    }

    public boolean isAvailable() {
        return true;
    }
}
