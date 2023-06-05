package ua.hillel.automation.java.lesson8.part2lesson;

public class StaticEx {
    //static
    //якщо є сумніви чи писати static - краще не писати
    //все що помічено static відноситься не до конкретного об'єкту а до всього класу взагалі
    //тобто щоб звернутись до поля/методу нам не потрібно створювати об'єкт такого типу
    //static навантажує пам'ять
    public static void main(String[] args) {
        //щоб отримати доступ до нестатичного поля потрібно створити об'єкт класу:
        //і в кожного об'єкту буде своє значення nonStaticVar
        new Statics().nonStaticVar = "nnn";
        //щоб отримати доступ до статичного поля треба знати тільки назву класу
        //значення staticVar буде спільне (і змінюватись для всіх об'єктів)
        Statics.staticVar = "sss";
        //приклад
        Statics statics1 = new Statics();
        statics1.nonStaticVar = "111";

        Statics.staticVar = "static var";
        System.out.println(Statics.staticVar);

        Statics statics2 = new Statics();
        statics2.nonStaticVar = "222";

        System.out.println(statics1.nonStaticVar);
        System.out.println(statics2.nonStaticVar);

        Statics.staticVar = "new static var";
        System.out.println(Statics.staticVar);
        //щоб отримати доступ до статичних методів не потрібно створювати об'єкт
        //нестатичний метод
        System.out.println();
        Statics statics = new Statics();
        statics.nonStaticMethod();
        //статичний метод
        //зі статичних методів не можна отримати доступ до нестатичних змінних
        //бо немає довіри що об'єкт був створений і в нього є нестатичні змінні
        Statics.staticMethod();
        reUseMe();

    }
    //методи що ми виносим з main щоб викликати в main як і main мають бути статичними
    //або ж відноситись до конкретного об'єкту
    public static void reUseMe() {
    //метод можна викликати в main
    }
    private void reUseMeAgain(){
        //цей метод неможливо викликати в main бо він не статичний і не відноситься до об'єкту
    }
}
