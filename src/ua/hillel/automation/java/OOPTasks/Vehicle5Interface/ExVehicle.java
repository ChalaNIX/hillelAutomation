package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

public class ExVehicle {
    public static void main(String[] args) {
        Motorcycle moto = new Motorcycle();
        Car car = new Car();
        Truck truck = new Truck();

        VehicleManagementSystem vehicleManagementSystem = new VehicleManagementSystem();
        vehicleManagementSystem.addVehicle(moto);
        vehicleManagementSystem.addVehicle(car);
        vehicleManagementSystem.addVehicle(truck);

        System.out.println(vehicleManagementSystem.amountOfVehicle());

        vehicleManagementSystem.drive();

    }
}
