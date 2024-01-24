package ua.hillel.automation.java.xRepeatHomework.lesson3;

import java.util.Scanner;

/*
1.Написати програму "CheckOddEven" яка друкує "Odd number", якщо змінна непарна, або "Even number", якщо парна.
Перед завершенням роботи програма має друкувати "BYE". Значення змінної можна задати вручну через Scanner або присвоїти початкове значення в коді
2.Написати програму "PrintMonthInWord" яка друкує "JAN", "FEB" ... "DEC" якщо значення int змінної дорівнює 1, 2,
 3 ... 12. Або повинна вивести "Not a valid month". Розв'язати завдвння 2 способами:
1) за допомогою операторів if-else
2) за допомогою оператора switch
3.Написати програму, яка буде порывнювати абсолютні значення двох чисел. Наприклад, для чисел 3 та -9 прогама
повинна надрукувати, що -9 має більше абсолютне значення. Для визначення абсолютного значення можна скористатися
методом зі стандратної бібліотеки Math.abs()
4.Написати програму, яка визначає, чи є трикотник рівнобедреним. Значення сторін трикутника задавати самостійно
 */
public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        System.out.println("BYE");

        int month = number;

        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }

        //absolute numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(Math.abs(a) > Math.abs(b)) {
            System.out.println(a+ " is bigger than " +b);
        } else if (Math.abs(b) > Math.abs(a)) {
            System.out.println(b+ " is bigger than " +a);
        } else {
            System.out.println("Numbers are even");
        }

        //чи трикутник рівнобедрений
        int c = 5;
        int d = 4;
        int e = 5;

        if(c==d || c==e || e==d) {
            System.out.println("the triangle is isosceles");
        }
    }
}
