package ua.hillel.automation.java.Lesson9.uneasysolution;

public class ProductTest {
    public void testProductCreation() {
        ProductDetailPage productDetailPage = new ProductDetailPage();
        //очевидне дублювання коду
        //product 1
        productDetailPage.setProductName("prod1");
        productDetailPage.setDescription("desc1");
        productDetailPage.setCategory("notebook");
        productDetailPage.setPrice(1299);

        //product 2
        productDetailPage.setProductName("prod2");
        productDetailPage.setDescription("desc2");
        productDetailPage.setCategory("notebook");
        productDetailPage.setPrice(1299);
    }
}
