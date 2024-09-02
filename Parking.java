import java.security.SecureRandom;

public class Parking {

    static String completion = "A toute l equipe du parking manager";
    static ParkingService parkingService = new ParkingService();

    public static void main(String[] args) {

        String[] customers = { "Ally", "John", "Doe", "Dev", "Dorc", "Abel", "Pam", "Steph" };
        int parkingSize = new SecureRandom().nextInt(10);

        sayHello();
        /*
         * for (int i = 0; i < customers.length; i++) {
         * goodayIteration(customers[i]);
         * }
         */
        /*
         * for (String element : customers) {
         * goodayIteration(element);
         * }
         */

        int customerNumer = 0;
        System.out.println("Nous avons " + parkingSize + " Places restantes");

        while (parkingSize > 0) {
            parkingSize--;

            if ("Dev".equals(customers[customerNumer])) {
                parkingSize++;
                customerNumer++;
                continue;
            }

            if ("Abel".equals(customers[customerNumer])) {
                break;
            }
            goodayIteration(customers[customerNumer]);
            customerNumer++;
        }

        sayBye();

    }

    private static void sayHello() {
        String welcomeMessage = "Hello Bienvenu dans le parking chers tous ... ";
        System.out.println(welcomeMessage + completion);
    }

    private static void goodayIteration(String customer) {
        String goodayMessage = parkingService.informationData;

        System.out.println(goodayMessage + " Customer: " + customer);

    }

    private static void sayBye() {
        String messageBye = "A tres bientot ";
        String parking = parkingService.parking;
        String washing = parkingService.washing;
        System.out.println(messageBye.toUpperCase() + completion + " avec : " + washing);

    }
}
