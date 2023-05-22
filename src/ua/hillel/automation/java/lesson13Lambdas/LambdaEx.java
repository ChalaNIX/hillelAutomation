package ua.hillel.automation.java.lesson13Lambdas;//лямбди можна створювати коли в нашому інтерфейсі є лише один метод
//лямбди - це анонімні функції
//лямбди - це функціональне програмування, а не ООП
//@FunctionalInterface - анотація (перевірка) для інтерфейсу щоб не додавались інші методи
//інтерфейс має містити лише 1 метод без реалізації
//
//в 8 джава ще була додана можливість додавати посилання на методи - метод референс

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx {
    public static void main(String[] args) {
        MyIFace iFace2 = new MyIFace() {
            @Override
            public void method1(String value, int num) {

            }
        };
        //MyIFace interface
        MyIFace iFace = (s,num) -> {   //1 параметр можна писати без дужок, 0 - пусті дужки
            System.out.println(s+num);
        };
        iFace.method1("Hello, world!",11111);
        //ReturnFace interface
        ReturnFace returnFace = () -> new Random().nextInt(); //return в 1 рядку необов'язковий
        System.out.println(returnFace.MyMethod2());
        //Predicate
        Predicate<String> predicate = s -> s.contains("Java");
        System.out.println(predicate.test("Java Automation"));
        //Supplier (не приймає, повертає)
        //Supplier<Integer> supplier = () -> new Random().nextInt();
        Supplier<Integer> supplier = () -> new Random().nextInt();
        //Supplier<Integer> supplier = iFace2::method1; - строка з заняття, не працює
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        //Consumer (приймає, не повертає)
        Consumer<Integer> consumer = (i) -> System.out.println(i);
        consumer.accept(10);
        //Function (one type to another)
        Function<String, Integer> function = s -> Integer.valueOf(s);
        System.out.println(function.apply("20")+function.apply("33"));

        System.out.println();

        funkmethod((x,p) -> System.out.println(x+p)); //оголощення цієї функції потім буде викликатись в іншому місці
        //тобто лямбда - це створення реалізації, а виконання - відкладене (поки не буде викликаний метод method1 в методі funkmethod
        //в коді зустрічатиметься рідко

        Function<String, Integer> function2 = Integer::valueOf;  //method reference
        //статичний метод з класу Integer, назад повертається int значення - джава знає що робити

        //stream - додаткова допоміжна сущність для колекції. щоб розпапалелити роботу над коллекцією
    }

    public static void funkmethod(MyIFace myIFace) {
        myIFace.method1("",0);

    }
}
