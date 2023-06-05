package ua.hillel.automation.java.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomEvenNumbers {
    /*
    Написати програму, яка в масиві з випадкових цілих чисел замінює всі парні числа на 0
    і виводить отриманий масив на екран. Для генерації випадкових чисел можна користуватись Random:
     */
    public static void main(String[] args) {
        //create array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int length = scanner.nextInt();
        int[] array = new int [length];
        //fulfill array
        Random random = new Random();
        for (int i = 0; i< array.length;i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        //вивести масив
        System.out.println("Array:");
        System.out.println(Arrays.toString(array));

    }
}
