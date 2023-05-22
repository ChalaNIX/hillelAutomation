package ua.hillel.automation.java.lesson13Lambdas.Steam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamEx {
    public static void main(String[] args) {
        //відфільтрувати null,перевести строкові елементи в числові, в кінці щось порахувати
        List<String> stringList = new LinkedList<>();
        stringList.add("10");
        stringList.add("");
        stringList.add("1");
        stringList.add("15");
        stringList.add("");
        stringList.add("30");

        List<Integer> integerList = new ArrayList<>();
        for (String s: stringList){
            if (!s.isBlank()) {
                integerList.add(Integer.valueOf(s));
            }
        }
        for (int i=0; i<integerList.size(); i++) {
            integerList.set(i, integerList.get(i)*100);
        }
        System.out.println(integerList);

        //steam version of task

        List<Integer> streamList = stringList.stream().filter(s -> !s.isBlank())
                .map(Integer::valueOf).filter(i ->i>20).map(i->i*100).collect(Collectors.toList());
        System.out.println(streamList);

        //потік можна просто зберегти stream і використати його потім (рідко)
        Stream<Integer> stream = stringList.stream().filter(s -> !s.isBlank())
                .map(Integer::valueOf).filter(i ->i>20).map(i->i*100);
        //замість .stream(). можна використовувати parallel.stream (в тестуванні особливо не використовується)
        int value = stringList.stream().filter(s -> !s.isBlank())
                .map(Integer::valueOf).filter(i ->i>20).map(i->i*100).findFirst().orElseThrow(() -> new RuntimeException("No value"));

        System.out.println(value);

        //може використовуватися при пошуці веб елементів на сторінці. вони зчитуються як String а потім форматуєм і шукаєм що нам треба
        //метод forEach що приймає функцію Consumer (яка нічого не повертає)
        stringList.forEach(s -> {System.out.println("Element"+s);
        });

    }
}
