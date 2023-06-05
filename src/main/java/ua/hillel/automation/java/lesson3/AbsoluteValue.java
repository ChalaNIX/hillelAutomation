package ua.hillel.automation.java.lesson3;

import java.util.Scanner;

public class AbsoluteValue {
        /*
    3.Написати програму, яка буде порывнювати абсолютні значення двох чисел.
    Наприклад, для чисел 3 та -9 прогама повинна надрукувати, що -9 має більше абсолютне значення.
    Для визначення абсолютного значення можна скористатися методом зі стандратної бібліотеки Math.abs()
    */
        public static void main(String[] args) {
            //enter numbers
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int firstNumber = scanner.nextInt();
            int secondNumber = scanner.nextInt();
            //compare numbers
            if (Math.abs(firstNumber) > Math.abs(secondNumber)) {
                System.out.println(firstNumber + " has bigger value");
            } else if (Math.abs(firstNumber) < Math.abs(secondNumber)){
                System.out.println(secondNumber + " has bigger value");
            } else {
                System.out.println("Values are the same");
            }

        }
}
