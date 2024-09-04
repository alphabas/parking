import java.sql.Date;

public class Ticket {
    private String amount;
    private Vehicle vehicle;
    private Date enteringTime;
    private Date exitTiket;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicule(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(Date enteringTime) {
        this.enteringTime = enteringTime;
    }

    public Date getExitTiket() {
        return exitTiket;
    }

    public void setExitTiket(Date exitTiket) {
        this.exitTiket = exitTiket;
    }

    @Override
    public String toString() {
        return "Ticket d'un montant de: " + amount + " $ pour vehicule de type " + vehicle.getCategory() +
                " Entrer a " + enteringTime + " Et sorti a : " + exitTiket;
    }

}
