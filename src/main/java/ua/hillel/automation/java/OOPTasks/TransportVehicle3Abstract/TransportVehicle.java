package ua.hillel.automation.java.OOPTasks.TransportVehicle3Abstract;

public abstract class TransportVehicle {
    final private int wheels;

    public abstract int calculateSpeed();

    public TransportVehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }
}
