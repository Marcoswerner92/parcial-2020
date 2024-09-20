import Model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Motorcycle moto1 = new Motorcycle("Picante", 500.00, VehicleType.MOTORCYCLE, 1, 350.00);
        Race car1 = new Race("Ferraro", 1500.00, VehicleType.RACE, 23, 350.00);
        Utilitary util1 = new Utilitary("Pacho", 500.00, VehicleType.UTILITARY, 45, 2500.00, 2.2);

        moto1.competeInPista(); //Ejercicio 2
        car1.competeInPista(); //Ejercicio 2

        System.out.println(moto1);
        System.out.println(util1);

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        VehicleInterface VehicleService = new VehicleService();

        VehicleService.addVehicleToList(moto1, vehicleList);
        VehicleService.addVehicleToList(car1, vehicleList);
        VehicleService.addVehicleToList(util1, vehicleList);

        VehicleService.showVehicleList(vehicleList);

        for


    }
}