import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("mocha", 3.50);
        Item item2 = new Item("latte", 4.20);
        Item item3 = new Item("drip coffee", 2.00);
        Item item4 = new Item("cappuccino", 3.80);

        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Print the order1 variable to the console
        System.out.println(order1);

        // Predict what will happen if you print order1.total
        System.out.println(order1.total); // It should display 0.0

        // Add item1 to order2's item list and increment the order's total
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.total += item2.price * 2;

        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;

        // Print order details after updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %.2f\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %.2f\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);

        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %.2f\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
