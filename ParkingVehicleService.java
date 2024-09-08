import java.util.Date;
import java.sql.SQLException;

public class ParkingVehicleService {

    public Ticket processIncomingVehicule(Vehicle vehicle) {

        Ticket ticket = new Ticket();
        Date now = new Date();

        java.sql.Date sqlDate = new java.sql.Date(now.getTime());
        ticket.setEnteringTime(sqlDate);

        // ticket.setEnteringTime(now);
        ticket.setVehicule(vehicle);
        return ticket;

    }

    public Ticket processExistingVehicle(Ticket ticket) {
        long now = new Date().getTime();
        now += 60 * 1000;

        Date exitTime = new Date(now);
        java.sql.Date sqlDate = new java.sql.Date(exitTime.getTime());

        ticket.setExitTiket(sqlDate);

        Vehicle vehicle = ticket.getVehicle();
        VehicleModelEnum category = vehicle.getCategory();

        double pricePerMinForCitadine = 0.08;
        double pricePerMinFor2Roues = 0.02;
        double defaultPricePerMin = 0.05;

        long durationInMinutes = (ticket.getExitTiket().getTime() - ticket.getEnteringTime().getTime()) / (60 * 1000);
        double finalPrice = 0;
        /*
         * if ("CITADINE".equals(category)) {
         * finalPrice = durationInMinutes * pricePerMinForCitadine;
         * } else if ("2 ROUES".equals(category)) {
         * finalPrice = durationInMinutes * pricePerMinFor2Roues;
         * } else {
         * finalPrice = durationInMinutes * defaultPricePerMin;
         * }
         */

        switch (category) {
            case CITADINE:
                finalPrice = durationInMinutes * pricePerMinForCitadine;
                break;
            case DEUXROUES:
                finalPrice = durationInMinutes * pricePerMinFor2Roues;
                break;
            default:
                finalPrice = durationInMinutes * defaultPricePerMin;
                break;
        }
        ticket.setAmount(finalPrice);
        return ticket;
    }
}
