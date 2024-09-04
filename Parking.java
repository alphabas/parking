public class Parking {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setRegisterNumber("LS-324-PM");
        vehicle.setCategory("CITADINE");

        ParkingVehicleService parkingVehicleService = new ParkingVehicleService();
        Ticket ticket = parkingVehicleService.processIncomingVehicule(vehicle);

        System.out.println(ticket);

    }

}
