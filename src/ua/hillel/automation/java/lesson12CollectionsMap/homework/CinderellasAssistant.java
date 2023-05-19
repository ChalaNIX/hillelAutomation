package ua.hillel.automation.java.lesson12CollectionsMap.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
Написати програму, яка замість попелюшки сортує числа з початкової колекції на 3 кошика:
в перший - числа, які діляться на 2,
в другий - числа, які діляться на 3,
в третій - всі інші.
Якщо число ділиться на 2 і на 3, то воно має попасти в обидва кошика.
Початкову колекцію з 100 елементів заповнити випадковими цілими числами.
 */
public class CinderellasAssistant {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        List<Integer> numsDivideTwo = new ArrayList<>();
        List<Integer> numsDivideThree = new ArrayList<>();
        List<Integer> numsOther = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <100; i++) {
            nums.add(random.nextInt(100));
        }

        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            double divideTwo = number%2;
            double divideThree = number%3;
            if (divideTwo==0) {
                numsDivideTwo.add(number);
            }
            if (divideThree==0) {
                numsDivideThree.add(number);
            }
            if(divideTwo!=0 && divideThree!=0) {
                numsOther.add(number);
            }
        }
        System.out.println(nums);
        System.out.println(numsDivideTwo);
        System.out.println(numsDivideThree);
        System.out.println(numsOther);

    }
}
