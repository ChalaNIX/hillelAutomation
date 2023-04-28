package ua.hillel.automation.java.lesson7;

import ua.hillel.automation.java.lesson6.lessonmaterial2.Dog;

public class MethodEx {
    public static void main(String[] args) {
        MethodLib myMethLib = new MethodLib();
        myMethLib.methodWithParams("fds",90,false);  //створюємо об'єкт і викликаємо метод

        new MethodLib().methodWithParams("abc", 1, true); //викликаєм метод але об'єкт неможливо перевикористати
        // - нам непотрібно його створювати, він створюється і одразу видаляється

        int input = 10;

        int output = myMethLib.convertInt(input);
        System.out.println(input + " " + output);

        Dog dog = new Dog();
        dog.setAge(10);

        Dog dog1 = myMethLib.updateDog(dog);
        System.out.println(dog);
        System.out.println(dog1);

        myMethLib.createProducts();
        myMethLib.createProducts("p1");
        myMethLib.createProducts("p1","p2");
        myMethLib.createProducts("p1","p2","p3");

        myMethLib.methodWithVarArg(1);


        myMethLib.giveDiscount(1);
        myMethLib.giveDiscount(1.2);
    }
}
