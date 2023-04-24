package ua.hillel.automation.java.lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AVR {
    /*
    Написати програму, яка обчислює середнє арифметичне значення всіх елементів у масиві з 20 випадкових чисел
     */
    public static void main(String[] args) {
        //create array
        int[] array = new int [20];
        //fulfill array and count average
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            sum += array[i];
        }
        int avr = sum / array.length;
        System.out.println("Average: " + avr);
        //check array
        System.out.println(Arrays.toString(array));
    }
}
