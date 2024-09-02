import java.util.Date;

public class ParkingVehicleService {

    public Ticket processIncomingVehicule(Vehicle vehicle) {

        Ticket ticket = new Ticket();
        Date now = new Date();
        ticket.setEnteringTime(now);
        ticket.setVehicule(vehicle);

        return ticket;

    }
}
