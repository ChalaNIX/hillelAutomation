package ua.hillel.automation.java.lesson12CollectionsMap.homework;
//Написати програму яка видаляє з колекції цілих чисел всі дублікати, якщо вони є.
// Початкову колекцію з 100 елементів потрібно заповнити випадковими числами (ліміт 50).
// На екран потрібно вивести обидві колекції та кількість видалених дублікатів.
// (За бажанням можна вирішити декількома способами та порівняти, який з них швидше)

import java.util.*;

public class CollectionWithoutDuplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            list.add(random.nextInt(50));
        }

        Set<Integer> list2 = new HashSet<>(list);
        System.out.println(list);
        System.out.println(list2);
        System.out.println();
        System.out.println("Amount of duplicates: "+(list.size()-list2.size()));
    }

}
