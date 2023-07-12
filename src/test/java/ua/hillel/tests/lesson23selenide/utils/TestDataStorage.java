package ua.hillel.tests.lesson23selenide.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestDataStorage {
    private static Map<String, Object> testData = new HashMap<>();

    public static void saveTestData(String name, Object value) {
        testData.put(name,value);
    }

    public static Object getTestData(String name) {
        return testData.get(name);
    }

}
