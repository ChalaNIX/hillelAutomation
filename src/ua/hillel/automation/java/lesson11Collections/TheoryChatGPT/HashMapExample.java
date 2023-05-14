package ua.hillel.automation.java.lesson11Collections.TheoryChatGPT;
import java.util.HashMap;
import java.util.Map;

//зберігає ключі та значення у вигляді пар (key-value pairs), де кожен ключ пов'язаний зі своїм значенням.
// Ключі у HashMap є унікальними

public class HashMapExample {
    public static void main(String[] args) {
        // Створюємо новий об'єкт HashMap з ключами та значеннями типу String
        Map<String, String> phoneBook = new HashMap<>();

        // Додаємо записи у мапу
        phoneBook.put("John", "555-1234");
        phoneBook.put("Jane", "555-5678");
        phoneBook.put("Jim", "555-9999");

        // Отримуємо значення за ключем
        String johnsNumber = phoneBook.get("John");
        System.out.println("John's number is " + johnsNumber);

        // Видаляємо запис за ключем
        phoneBook.remove("Jim");

        // Перевіряємо, чи міститься ключ у мапі
        if (phoneBook.containsKey("Jane")) {
            System.out.println("Jane's number is " + phoneBook.get("Jane"));
        }

        // Виводимо всі ключі та значення у мапі
        for (String name : phoneBook.keySet()) {
            String number = phoneBook.get(name);
            System.out.println(name + ": " + number);
        }
    }
}
