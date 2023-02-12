package UdemyMasterclass.Section11Abstraction.L153_154_AbstractChallenge;

import java.util.ArrayList;

/**
 * Abstract Class challenge
 * Build an application, that can be a store front, for any imaginable item for sale.
 * Instead of the Main class we usually create, create a Store class, with a main method.
 * The Store class should:
 *   . manage a list of products for sale, including displaying the product details
 *   . manage and order, which can be just a list of OrderItem objects
 *     have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt
 * Create a ProductForSale class that should have at least three fields: a type, price and a description
 * should have methods to:
 *   . get a Sales Price, a concrete method, which takes a quantity, and returns the quantity times the price
 *   . print a Priced Line Item, which takes a quantity, and should print an itemized line item for an order,
 *     with quantity and line item price
 *   . show Details, an abstract method, which represents what might be displayed on a product page,
 *     product type, description, price, and so on
 * Create an OrderItem type, that has a minimum 2 fields, quantity and a Product for Sale
 * You should create two or three classes that extend the ProdutForSale class, that will be products in your store
 */

record OrderItem(int qty, ProductForSale product) {}

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new Vinyl("Bathory", 23.5, "Under the Sign of the Black Mark"));
        storeProducts.add(new Vinyl("Venom", 22.0, "Black Metal"));
        storeProducts.add(new Vinyl("Morbid Angel", 24.3, "Altars of Madness"));

        storeProducts.add(new K7("Dissection", 19.99, "The Somberlain"));
        storeProducts.add(new K7("Dismember", 21.50,"Like an Everflowing Stream"));

        listProducts();

        //create an order
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2 );
        addItemToOrder(order1, 0, 5 );
        printOrder(order1);

        //create a 2nd order
        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 3 );
        addItemToOrder(order2, 4, 1 );
        printOrder(order2);
    }

    public static void listProducts() {

        for (var product : storeProducts) {
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0.0;
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = € %3.2f %n", salesTotal);

    }
}

