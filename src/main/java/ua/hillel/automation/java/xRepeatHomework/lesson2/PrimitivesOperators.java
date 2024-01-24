package ua.hillel.automation.java.xRepeatHomework.lesson2;

public class PrimitivesOperators {
    public static void main(String[] args) {
        /*
1. Написати програму, яка конвертує градуси Цельсія у Фаренгейти и Кельвіни
Формули
Celsius = 5/9 (F - 32)        F=  C · 1,8 + 32
Kelvin = C + 273.16
Вивід має бути приблизно таким: X C: Y F; Z K, де X - початкове значення в градусах Цельсія, Y и Z - обчислені значення в Фаренгейтах и Кельвінах відповідно.
2. Написати програму, яка обчислює площу прямокутного трикутника, початкові значення сторін можна задати довільно.
3 Написати програму, яка обчислює площу кола. Для обчислень можна використовівати библіотеку Math (Math.pow() для зведення у ступінь 2)
         */
        //градуси
        double c = 36.6;
        double f = c * 1.8 + 32;
        double k = c + 273.16;

        System.out.println(c + " C," + f + " F," + k +" K");

        // площа прямокутника
        double a = 3;
        double b = 4;
        //c = 5;
        double triangleArea = 0.5 * a * b;
        System.out.println(triangleArea);

        //площа кола S = pi * R(2)
        double r = 2;
        double s = Math.PI * Math.pow(r,2);
        System.out.println("S: " + s);

        //практика

        int maxValue = Integer.MAX_VALUE;
        int sizeBits = Integer.SIZE;
        System.out.println(maxValue);
        System.out.println(sizeBits);

    }
}
