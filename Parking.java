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

    }

    private static void processVehicles() {

        Set<Ticket> tickets = new HashSet<>();

        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-458-4P");
        Ticket VehicleTicket = parkingVehicleService.processIncomingVehicule(vehicle);
        tickets.add(VehicleTicket);
        System.out.println(VehicleTicket);

        Vehicle bicycle = new Bicycle();
        bicycle.setRegistrationNumber("F0-459-R9");
        Ticket bicycletTicket = parkingVehicleService.processIncomingVehicule(bicycle);
        tickets.add(bicycletTicket);
        System.out.println(bicycletTicket);

        Vehicle car = new Car();
        car.setRegistrationNumber("JDI-34-SOS");
        Ticket carTicket = parkingVehicleService.processIncomingVehicule(car);
        tickets.add(carTicket);
        System.out.println(carTicket);

        /*
         * Ticket[] tickets = new Ticket[3];
         * tickets[0] = VehicleTicket;
         * tickets[1] = bicycletTicket;
         * tickets[2] = carTicket;
         */

        System.out.println("Traitement des sorties par lot");

        Map<Integer, Ticket> exitOrder = new HashMap<>();
        int position = 0;

        for (Ticket ticket : tickets) {
            exitOrder.put(position, ticket);
            position++;
            System.out.println(parkingVehicleService.processExistingVehicle(ticket));

        }

        /*
         * for (Ticket ticket : tickets) {
         * System.out.println(parkingVehicleService.processExistingVehicle(ticket));
         * }
         */

        Set<Integer> keySet = exitOrder.keySet();
        for (int key : keySet) {
            System.out
                    .println("Position dans la liste : " + key + " : " + exitOrder.get(key).getVehicle().getCategory());

        }

    }

}
