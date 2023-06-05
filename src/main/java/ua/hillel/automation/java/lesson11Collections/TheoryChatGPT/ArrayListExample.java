package ua.hillel.automation.java.lesson11Collections.TheoryChatGPT;
import java.util.ArrayList;
//масиви теж представники колекцій
//Зокрема, інтерфейс Set представляє колекцію, яка містить унікальні елементи без поняття порядку.
// Це означає, що ви не можете мати два однакових елементи в Set.
// Інтерфейси List та Queue дозволяють додавати елементи в колекцію з можливістю отримати їх у певному порядку.
public class ArrayListExample {
    public static void main(String[] args) {
        // Створюємо ArrayList для зберігання цілих чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Додаємо елементи в ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Виводимо елементи ArrayList
        System.out.println("Елементи ArrayList: " + numbers);

        // Видаляємо елемент з ArrayList
        numbers.remove(2);

        // Виводимо елементи ArrayList після видалення елементу
        System.out.println("Елементи ArrayList після видалення: " + numbers);
    }
}
