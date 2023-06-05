package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
