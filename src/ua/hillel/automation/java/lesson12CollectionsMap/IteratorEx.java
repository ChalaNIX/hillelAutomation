package ua.hillel.automation.java.lesson12CollectionsMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("one");
       list.add(" ");
       list.add("two");
       list.add("");
       list.add("one");
       list.add("three");

       //новий спосіб
        list.removeIf(s->s.isBlank());
//не працюючий спосіб - ексепшн
//       for (String s: list) {
//           if (s.isBlank()) {
//               list.remove(s);   //ConcurrentModificationException
//           }
//       }
        //застарілий спосіб. ітератор одноразовий
//       Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {  //поки є наступний елемент
//            String s = iterator.next(); //кожен раз як викликаєм ітератор - показує наступний елемент
//            if (s.isBlank()) {
//                iterator.remove();
//            }
//        }
        System.out.println(list);
    }
}
