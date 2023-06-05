package ua.hillel.automation.java.Lesson9InnerClasses.easysolution;

public class ProductTest {
    //клас контейнер і всередині - внутрішній клас
    //Nested classes: inner class and static nested class (відносяться до всього класу)
    //Inner class: inner class, Method-local Inner Class, Anonymous Inner Class
    public void testProductCreation() {

        //product using static inner class
        Product product3 = new Product();
        product3.name = "prod3";
        product3.description = "desc3";
        product3.category = "notebook";
        product3.price = 1599;
        product3.discount = 5;
        createProd(product3);

    }

    private void createProd(Product product) {
        ProductDetailPage productDetailPage = new ProductDetailPage();
        productDetailPage.setProductName(product.name);
        productDetailPage.setDescription(product.description);
        productDetailPage.setCategory(product.category);
        productDetailPage.setPrice(product.price);
    }
    //static nested class. у класу контейнера є доступ до приватних полів класу Product
    public static class Product { //може бути private якщо не плануєм ніде більше використовувати (як і є зараз)
        String name;
        String description;
        String category;
        double price;
        double discount;

        public String getName() {
            return name;
        }
    }
}
