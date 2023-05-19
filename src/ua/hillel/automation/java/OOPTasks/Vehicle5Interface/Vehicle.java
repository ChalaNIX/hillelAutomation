package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle is moving");
    }
    default void stop() {
        System.out.println("Vehicle stops");
    }
}
