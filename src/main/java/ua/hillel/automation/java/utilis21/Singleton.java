package ua.hillel.automation.java.utilis21;
//Singleton потрібен щоб зберігати driver окремо і отримувати на нього посилання. використовувати кожен раз
//одне й те саме посилання без зміни об'єкту

//використовується не тільки з драйвером, а з будь чим до чого нам треба посилання на один і той самий об'єкт

//Singleton - шаблон програмування
//Singleton і DriverHolder використовуються в парі

public class Singleton {
    private static Singleton instance;  //має бути статичним

    private Singleton(){}  //закритий доступ до створення такого об'єкта

    static Singleton getInstance() {  //це один з варіантів створення Singleton
        if (instance == null) {   //якщо instance не проініціалізований - ми дійсно його створюємо
            instance = new Singleton();
        }                             //якщо вже створений - то повертається один і той самий об'єкт
        return instance;
    }
}
