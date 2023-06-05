package ua.hillel.automation.java.Lesson9InnerClasses.easysolution;

public class NextedClassEx {
    public static void main(String[] args) {
        //щоб звернутись до внутрішноього класу зазначаємо ім'я класу контейнера
        ProductTest.Product product = new ProductTest.Product();
        product.getName();

        //доступ до enum всередині класу

        System.out.println(AppValues.ProductStatus.WAITING);

    }
}
