package ua.hillel.automation.java.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        /*
        3 Написати програму, яка обчислює площу кола.
        Для обчислень можна використовівати библіотеку Math (Math.pow() для зведення у ступінь 2)
         */
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("Enter radius of circle: ");
        try {
            double radius = scanner.nextDouble();
            double circleArea = pi * Math.pow(radius, 2);
            System.out.println("Area of circle: "+ circleArea);
        }
        catch (InputMismatchException e) {
            System.out.println("Error. Invalid input");
        }

    }
}
