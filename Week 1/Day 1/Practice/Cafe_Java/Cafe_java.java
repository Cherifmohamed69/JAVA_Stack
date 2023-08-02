public class Cafe_java {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0; // New drink price variables
        double lattePrice = 4.0; // New drink price variables
        double cappuccinoPrice = 4.5; // New drink price variables

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Noah"; // New customer variables
        String customer3 = "Sam"; // New customer variables
        String customer4 = "Jimmy"; // New customer variables

        // Order completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true; // New order status flag for Noah
        boolean isReadyOrder3 = false; // New order status flag for Sam
        boolean isReadyOrder4 = true; // New order status flag for Jimmy

        // APP INTERACTION SIMULATION
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"

        // Cindhuri ordered a coffee
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah ordered a cappuccino
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Sam ordered 2 lattes
        double totalSam = 2 * lattePrice;
        System.out.println(displayTotalMessage + totalSam);
        if (isReadyOrder3) {
            System.out.println(customer3 + readyMessage);
        } else {
            System.out.println(customer3 + pendingMessage);
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte
        double jimmyOwes = lattePrice - mochaPrice;
        System.out.println(displayTotalMessage + jimmyOwes);

        // Testing different prices and order statuses
        mochaPrice = 4.0;
        isReadyOrder1 = true;
    }
}

