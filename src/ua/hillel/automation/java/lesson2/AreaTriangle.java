package ua.hillel.automation.java.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        /*
        2. Написати програму, яка обчислює площу прямокутного трикутника,
        початкові значення сторін можна задати довільно.
         */
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter A side of triangle: ");
            double sideA = scanner.nextDouble();
            System.out.println("Enter B side of triangle: ");
            double sideB = scanner.nextDouble();
            double triangleArea = 0.5 * sideA * sideB;
            System.out.println("Area of triangle: "+ triangleArea);
        }
        catch (InputMismatchException e) {
            System.out.println("Error. Invalid input");
        }

    }
}
