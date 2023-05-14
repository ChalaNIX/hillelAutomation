package ua.hillel.automation.java.lesson11Collections.lessonmaterial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
//в list зберігається порядок елементів і можуть бути дублікати

public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        //додавання елементів
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,99);  //не замінюємо, а додаємо
        list.set(0,11); //замінюємо

        list2.add(99);
        list2.add(11);

        System.out.println(list.contains(99));
        System.out.println(list.containsAll(list2));


        //отримання елементу
        list.get(1);

        List<String> slist = List.of("fdbf","32543"," "); //ImmutableCollections - незмінні елементи. не можем дістати за індексом

        //перебирання елементів
        for (String s: slist) {
            System.out.println(s);
        }
        for (Integer i:list) {
            System.out.println(i);
        }

        //В LinkedList елемент поєднаний з два сусідніми елементами.
        //Тому всередину LinkedList елементи вставляються швидше ніж в Arraylist
        //в Arraylist швидше доступ за індексом
        //Arraylist найбільш поширений, граються з різними типами якщо виникають проблеми

        Integer [] iArr = {1,3,5};
        List<Integer> listFromArray = Arrays.asList(iArr);

        int [] iArr2 = {1,3,5};

        String categories = "note, phone, tablet";  //приклад переведення строки в масив строк а потім в список
        String[] catArray = categories.split(",");
        List<String> categoryList = Arrays.asList(catArray);


    }
}
