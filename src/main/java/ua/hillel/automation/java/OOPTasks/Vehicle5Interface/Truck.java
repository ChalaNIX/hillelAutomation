package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck is moving");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops");
    }
}
