package ua.hillel.automation.java.Lesson9InnerClasses.mediumsolution;

public class ProductTest {
    public void testProductCreation() {
        ProductDetailPage productDetailPage = new ProductDetailPage();
        //очевидне дублювання коду
        //product 1
        createProd("prod1", "desc1","notebook",1299);
        //product 2
        createProd("prod2", "desc2","notebook",1199);

    }
    private void createProd(String name, String desc, String category, double price) {
        ProductDetailPage productDetailPage = new ProductDetailPage();

        productDetailPage.setProductName(name);
        productDetailPage.setDescription(desc);
        productDetailPage.setCategory(category);
        productDetailPage.setPrice(price);
    }
}
