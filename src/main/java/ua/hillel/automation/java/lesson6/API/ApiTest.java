package ua.hillel.automation.java.lesson6.API;

import ua.hillel.automation.java.lesson6.lessonmaterial2.Dog;

public class ApiTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Apicat");

        Dog response = new ApiMock().createDog(dog);

        System.out.println(dog.equals(response));
    }
}
