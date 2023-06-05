package ua.hillel.automation.java.Lesson9InnerClasses.innerclass;

import ua.hillel.automation.java.Lesson9InnerClasses.easysolution.AppValues;

public class CatalogPage {
    public void filterByName(String name) {

    }
    public void filterByStatus(AppValues.ProductStatus productStatus) {

    }
    public class ProductTable {
        public ProductTable() {
            //init and parse table
        }
        public String getProductName() {
            return "";
        }
        public double getProductPrice() {
            return 0;
        }
        //статичні методи можуть бути у внутрішньому класі
        static int getProductCount() {
            return 0;
        }
    }
}
