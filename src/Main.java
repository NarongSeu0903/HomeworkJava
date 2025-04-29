import model.Vehicle;
import model.VehicleOfModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle(1, "uuid-001", "Car A", "ABC-123", "profile1.png", LocalDate.now(), VehicleOfModel.TOYOTA));
        vehicles.add(new Vehicle(2, "uuid-002", "Car B", "XYZ-789", "profile2.png", LocalDate.now(), VehicleOfModel.HONDA));
        vehicles.add(new Vehicle(3, "uuid-003", "Car C", "DEF-456", "profile3.png", LocalDate.now(), VehicleOfModel.TESLA));

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }

    }
}