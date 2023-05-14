package ua.hillel.automation.java.lesson11Collections.lessonmaterial;

import java.util.*;

// Set - без дублікатів. Hash - числове відображення об'єкту. в HashSet - порядок об'єктів не зберігається,
// не можна отримати елемент за індексом
// Hash працюють швидше всіх. Не можуть бути дублікатів
// LinkedHashSet - порядок зберігається, дублікатів немає, працює трохи повільніше.
// TreeSet - елементи в середині відсортовані (кожен раз як додаємо елемент)
public class SetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("three");
        set.add("two");
        set.add("22");
        set.add("999");

        System.out.println(set.size());

        for(String s: set) {
            System.out.println(s);
        }

        Set<String> set2 = new TreeSet<>();
        set2.add("one");
        set2.add("one");
        set2.add("two");
        set2.add("three");

        System.out.println("ThreeSet:");
        for(String s: set2) {
            System.out.println(s);
        }
        //Collections.sort();  //відсортувати
        //Collections.shuffle();  //перемішати
    }
}
