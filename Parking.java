import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Parking {

    static ParkingVehicleService parkingVehicleService = new ParkingVehicleService();

    public static void main(String[] args) {
        processVehicles();
        /*
         * int a = 10;
         * int b = a;
         * System.out.println("La valeur de A : " + a + " et de B est : " + b);
         */
    }

    private static void processVehicles() {

        Set<Ticket> tickets = new HashSet<>();

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-458-4P");
        Ticket VehicleTicket = parkingVehicleService.processIncomingVehicule(vehicle);
        System.out.println(VehicleTicket);
        parkingVehicleService.processExistingVehicle(VehicleTicket);
        System.out.println("Other : " + VehicleTicket);

    }

}
