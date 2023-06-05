package ua.hillel.automation.java.lesson6.API;

import ua.hillel.automation.java.lesson6.lessonmaterial2.Dog;

public class ApiMock {
    public Dog createDog (Dog dog) {
        System.out.println("Sending POST message to API");
        return dog;
    }
}
