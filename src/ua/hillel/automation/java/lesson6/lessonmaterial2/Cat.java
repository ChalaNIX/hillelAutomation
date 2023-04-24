package ua.hillel.automation.java.lesson6.lessonmaterial2;
/*
4 основні характеристики класу:
1. ім'я (включно з назвою пакету)
2. контруктор(и)
3. повний перелік полів (змінних) класу
4. методи (як об'єкти можуть взаємодіяти між собою)
 */
public class Cat {
    String color;   //поля класу
    String name;    //поля класу
    int age;         //поля класу

    // У об'єктів ще можуть бути методи

    public void sayMeow() {
        System.out.println(name + " says Meow");
    }
}
