package ua.hillel.automation.java.lesson3;

public class IsoscelesTriangle {
    /*
   4.Написати програму, яка визначає, чи є трикотник рівнобедреним. Значення сторін трикутника задавати самостійно
    */
    public static void main(String[] args) {
        //sides of triangle
        int sideA = 2;
        int sideB = 4;
        int sideC = 2;
        //check if isosceles
        if (sideA==sideB || sideB==sideC || sideC==sideA) {
            System.out.println("Your triangle is isosceles");
        }
    }
}
