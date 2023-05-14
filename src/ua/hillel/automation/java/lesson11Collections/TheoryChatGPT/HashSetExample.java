package ua.hillel.automation.java.lesson11Collections.TheoryChatGPT;
import java.util.HashSet;
//HashSet: HashSet - це колекція,
//яка не дозволяє дублювання елементів та не зберігає порядок елементів.
public class HashSetExample {
    public static void main(String[] args) {
        // Створюємо HashSet для зберігання рядків
        HashSet<String> names = new HashSet<String>();

        // Додаємо рядки в HashSet
        names.add("Олександр");
        names.add("Олена");
        names.add("Іван");
        names.add("Марія");
        names.add("Ігор");

        // Виводимо елементи HashSet
        System.out.println("Елементи HashSet: " + names);

        // Перевіряємо чи містить HashSet заданий елемент
        boolean containsName = names.contains("Іван");
        System.out.println("HashSet містить Івана: " + containsName);
        //
        //
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Two"); // не буде додано, тому що дублюється
        hashSet.add("Three");

        System.out.println(hashSet); // [One, Two, Three]

        hashSet.remove("Two");

        System.out.println(hashSet); // [One, Three]
    }
}
