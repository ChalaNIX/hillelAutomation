package ua.hillel.automation.java.lesson8.part2lesson;

import java.util.logging.Level;
import java.util.logging.Logger;

//клас не може бути статичним
//краще не міксувати статичні і не статичні методи і поля (крім логування, де лог - (static)
// додаткова штука)
public class Statics {
    public static String staticVar = "here can be default value";
    public String nonStaticVar= "here can be default value for static";

    //Логер
    private static final Logger LOGGER = Logger.getLogger(Statics.class.getName());

    public static void staticMethod() {
        System.out.println("I`m static method");
        //є доступ тільки до статичних змінних
        System.out.println(staticVar);
    }
    public void nonStaticMethod() {
        LOGGER.log(Level.INFO,"non-static method");
        System.out.println("I`m nonstatic method");
        //є доступ до статичних і нестатичних змінних
        System.out.println(staticVar);
        System.out.println(nonStaticVar);
    }
}
