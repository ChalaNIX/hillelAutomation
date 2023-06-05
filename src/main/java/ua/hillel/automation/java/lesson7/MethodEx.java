package ua.hillel.automation.java.lesson7;

import ua.hillel.automation.java.lesson6.lessonmaterial2.Dog;

public class MethodEx {
    public static void main(String[] args) {
        MethodLib myMethLib = new MethodLib();
        myMethLib.methodWithParams("fds",90,false);  //створюємо об'єкт і викликаємо метод
        //посилання на об'єкт збережено в змінній myMethLib

        new MethodLib().methodWithParams("abc", 1, true); //викликаєм метод але об'єкт неможливо перевикористати
        //частина new MethodLib() створює об'єкт, і з цього об'єкту викликається метод.в нас немає змінної де цей об'єкт збережений
        // - нам непотрібно його створювати, він створюється і одразу видаляється
        new MethodLib().methodWithParams("dfbvd",3,true); //ще раз


        //передача параметрів за значенням, і за посиланням

        int input = 10;

        int output = myMethLib.convertInt(input); //початковий input не змінився.input і output мають різні значення
        System.out.println(input + " " + output);
        //створюємо об'єкт і сетимо значення віку - 10
        Dog dog = new Dog();
        dog.setAge(10);
        //створюємо ще один об'єкт dog1, копіюючи в нього об'єкт dog
        //і одразу викликаємо на dog1 метод апдейту віку - updateDog
        Dog dog1 = myMethLib.updateDog(dog);
        //виводимо обидва об'єкти порівняти вік (однаковий бо одне посилання)
        System.out.println(dog);
        System.out.println(dog1);

        //тут різний вік бо ми в методі створювали окремого innerDog
        Dog dog2 = new Dog();
        dog2.setAge(10);

        Dog dog3 = myMethLib.updateDog(dog2);
        //виводимо обидва об'єкти порівняти вік (різний бо різні посилання)
        System.out.println(dog2);
        System.out.println(dog3);


        //myMethLib.createProducts();
        //myMethLib.createProducts("p1");
        //myMethLib.createProducts("p1","p2");
        //myMethLib.createProducts("p1","p2","p3");

        myMethLib.methodWithVarArg(1);


        myMethLib.giveDiscount(1);
        myMethLib.giveDiscount(1.2);
    }
}
