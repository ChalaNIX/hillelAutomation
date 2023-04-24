package ua.hillel.automation.java.lesson4;

public class SinX {
    /*
    1 Написати програму, яка друкує таблицю значень sin(x), де х - кожні 10 градусів від 0 до 360
     */
    public static void main(String[] args) {
        for (int i = 0; i<=360; i = i+10) {
            double sin = Math.sin(i);
            System.out.println("sin(" + i +'\u00B0'+") = " + String.format("%.2f", sin));
        }
    }
}
