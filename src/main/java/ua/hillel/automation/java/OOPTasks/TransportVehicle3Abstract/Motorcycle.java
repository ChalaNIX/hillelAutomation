package ua.hillel.automation.java.OOPTasks.TransportVehicle3Abstract;

public class Motorcycle extends TransportVehicle{
    private int speed;
    public Motorcycle(int wheels) {
        super(wheels);
        setSpeed();
    }
    @Override
    public int calculateSpeed() {
        return getWheels() * 15 +5;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed() {
        this.speed = calculateSpeed();
    }
}
