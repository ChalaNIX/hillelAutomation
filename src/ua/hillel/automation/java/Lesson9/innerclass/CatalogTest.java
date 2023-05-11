package ua.hillel.automation.java.Lesson9.innerclass;

import ua.hillel.automation.java.Lesson9.easysolution.AppValues;
//суть прикладу в тому, що для inner class потрібен об'єкт щоб використовувати його
//і що ProductTable складова CatalogPage
public class CatalogTest {
    public static void main(String[] args) {
        //доступ до таблиці
        CatalogPage catalogPage = new CatalogPage(); //створюємо екзмемпляр класу контейнера
        CatalogPage.ProductTable productTable = catalogPage.new ProductTable(); //створюємо екземпляр внутрішнього класу

        productTable.getProductName();
        //фільтер по таблиці
        catalogPage.filterByName("product1");
        catalogPage.filterByStatus(AppValues.ProductStatus.NEW);
        //відфільтровані данні
        productTable = catalogPage.new ProductTable();
        productTable.getProductName();

        //як звертатись до статичних методів внутрішнього класу
        CatalogPage.ProductTable.getProductCount();


    }
}
