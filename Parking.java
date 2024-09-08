public class Parking {

    static ParkingVehicleService parkingVehicleService = new ParkingVehicleService();

    public static void main(String[] args) {
        processVehicles();

    }

    private static void processVehicles() {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegistrationNumber("LS-458-4P");
        Ticket VehicleTicket = parkingVehicleService.processIncomingVehicule(vehicle);

        System.out.println(VehicleTicket);

        Vehicle bicycle = new Bicycle();
        bicycle.setRegistrationNumber("F0-459-R9");
        Ticket bicycletTicket = parkingVehicleService.processIncomingVehicule(bicycle);

        System.out.println(bicycletTicket);

        Vehicle car = new Car();
        car.setRegistrationNumber("JDI-34-SOS");
        Ticket carTicket = parkingVehicleService.processIncomingVehicule(car);

        System.out.println(carTicket);

        System.out.println(parkingVehicleService.processExistingVehicle(VehicleTicket));
        System.out.println(parkingVehicleService.processExistingVehicle(bicycletTicket));
        System.out.println(parkingVehicleService.processExistingVehicle(carTicket));

    }

}
