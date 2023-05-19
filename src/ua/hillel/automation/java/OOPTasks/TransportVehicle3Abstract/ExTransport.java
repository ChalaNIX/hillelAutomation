package ua.hillel.automation.java.OOPTasks.TransportVehicle3Abstract;

public class ExTransport {
    public static void main(String[] args) {
        Car car = new Car(4);
        Motorcycle motorcycle = new Motorcycle(2);

        System.out.println("Car speed is: "+ car.getSpeed());
        System.out.println("Motorcycle speed is: "+ motorcycle.getSpeed());

    }
}
