package ua.hillel.automation.java.lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Degrees {
    public static void main(String[] args) {
        //1. Написати програму, яка конвертує градуси Цельсія у Фаренгейти и Кельвіни
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter degrees in Calcium: ");
        try{
            double degreesCalcium = scanner.nextDouble();
            double degreesFahrenheit = (degreesCalcium * 9/5) + 32;
            double degreesKelvin = degreesCalcium + 273.15;
            System.out.println(degreesCalcium + "C " + degreesFahrenheit + "F " + degreesKelvin + "K");
        }
        catch (InputMismatchException e){
            System.out.println("Error. Invalid input");
        }


    }
}
