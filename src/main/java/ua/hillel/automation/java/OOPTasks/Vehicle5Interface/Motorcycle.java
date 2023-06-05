package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle is moving");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops");
    }
}
