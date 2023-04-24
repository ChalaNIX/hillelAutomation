package ua.hillel.automation.java.lesson3;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        //enter number
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //check odd/even
        if (number % 2 != 0) {
            System.out.println("Odd number");
        }
        else System.out.println("Even number");

        System.out.println("BYE");

    }
}
