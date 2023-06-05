package ua.hillel.automation.java.lesson8.homework;

public class Logger {
    public static void log(Level level, String log) {
        System.out.println(level.getLevel() + " " + log);
    }
}
