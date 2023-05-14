package ua.hillel.automation.java.lesson12CollectionsMap;

import java.util.HashMap;
import java.util.Map;

//ключі мають бути унікальними. кожен map - це set ключів, значення - list
//порядок елементів в HashMap не зберігається
//ключ змінити неможливо
//в LinkedHashMap зберігається порядок елементів
//Treemap - значення автоматично сортуются
public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("one",2); //значення оновиться, бо однакових ключів не може бути
        map.put("two",3);
        map.put("three",3);

        System.out.println(map.size());
        System.out.println(map.get(2)); //null бо не існує такого ключа
        System.out.println(map.get("one"));
        System.out.println(map.getOrDefault("five",2)); //повернути значення якщо знайшлось для ключа, або дефолтне

        //перебрати всі значення
        System.out.println("Values");
        for (Integer i: map.values()) {
            System.out.println(i);
        }
        //перебрати ключі
        System.out.println("Keys:");
        for (String key:map.keySet()) {
            System.out.println(key);       //key
            System.out.println(map.get(key));  //value
        }
        //перебрати значення і ключі
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }
    }
}
