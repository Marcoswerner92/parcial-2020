package Model;

import java.util.List;

public class VehicleService implements VehicleInterface{
    @Override
    public void addVehicleToList(Vehicle vehicle, List<Vehicle> vehicleList) {
        if (!vehicleList.contains(vehicle)){
            vehicleList.add(vehicle);
        }
    }

    @Override
    public void showVehicleList(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle);
        }
    }
}
