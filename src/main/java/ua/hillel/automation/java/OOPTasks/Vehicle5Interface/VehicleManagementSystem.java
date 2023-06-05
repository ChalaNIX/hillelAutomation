package ua.hillel.automation.java.OOPTasks.Vehicle5Interface;

import java.util.ArrayList;
import java.util.List;

public class VehicleManagementSystem {
    private List<Vehicle> autoList = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        autoList.add(vehicle);
    }
    public int amountOfVehicle() {
        return autoList.size();
    }
    public void drive() {
        for (Vehicle item : autoList) {
            item.start();
            item.stop();
        }
    }
}
