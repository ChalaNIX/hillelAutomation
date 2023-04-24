package ua.hillel.automation.java.lesson6.lessonmaterial2;

public class OopExampleCatDog {
    public static void main(String[] args) {
        Cat cat1 = new Cat();  //запуск конструктора для створення об'єкта кота
        cat1.name = "Antony";
        cat1.age = 2;
        cat1.color = "yellow";

        Cat cat2 = new Cat();
        cat2.name = "Marta";
        cat2.age = 1;

        System.out.println(cat1.name);
        System.out.println(cat2.name);

        cat1.sayMeow();
        cat2.sayMeow();

        //приклади з приватними полями класу Dog
        Dog dog1 = new Dog();
        dog1.setName("Sharik");
        dog1.setAge(2);
        dog1.setColor("black");
        String dogName = dog1.getName();
        System.out.println(dogName);
        System.out.println(dog1.getColor() +" "+ dog1.getName() + " " + dog1.getAge());
        //ctrl + click on method почитати про метод
        //метод виведе не дуже зрозумілу інфу. тому його можна переписати. Alt + insert, вибрати toString і поля які виводити
        //Метод toString() переписаний в класі Dog
        System.out.println(dog1.toString());
        //метод хешкод переписують бо він може виступати ідентифікатором об'єкта
        Dog dog2 = new Dog();
        dog2.setName("Sharik");
        dog2.setAge(2);
        dog2.setColor("black");
        //результат буде false, бо так не корректно порівнювати - порівнюються посилання
        System.out.println(cat1==cat2);
        //тут результат буде true
        Cat cat3 = cat2;
        System.out.println(cat2==cat3);
        //тут ми вже порівнюємо значення (тільки метод треба перезаписати в методі Dog
        //Частіше використовуємо в API. перевіряєм що інфа що ми відправили зберегти на сервер повертається такою ж - пекедж API
        System.out.println(dog1.equals(dog2));

    }
}
