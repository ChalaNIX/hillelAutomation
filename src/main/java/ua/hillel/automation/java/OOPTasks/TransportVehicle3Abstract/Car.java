package ua.hillel.automation.java.OOPTasks.TransportVehicle3Abstract;

public class Car extends TransportVehicle{
    private int speed;

    @Override
    public int calculateSpeed() {
        return (getWheels()*10)+5;
    }

    public Car(int wheels) {
        super(wheels);
        setSpeed();
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed() {
        this.speed = calculateSpeed();
    }
}
