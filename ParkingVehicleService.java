import java.util.Date;
import java.sql.SQLException;

public class ParkingVehicleService {

    public Ticket processIncomingVehicule(Vehicle vehicle) {

        Ticket ticket = new Ticket();
        Date now = new Date();

        java.sql.Date sqlDate = new java.sql.Date(now.getTime());
        java.sql.Date sqlDateExit = new java.sql.Date(now.getTime());

        ticket.setEnteringTime(sqlDate);
        ticket.setAmount("3400");
        ticket.setExitTiket(sqlDateExit);

        // ticket.setEnteringTime(now);
        ticket.setVehicule(vehicle);
        return ticket;

    }
}
