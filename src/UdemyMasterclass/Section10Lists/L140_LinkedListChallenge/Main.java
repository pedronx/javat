package UdemyMasterclass.Section10Lists.L140_LinkedListChallenge;

import java.io.IOException;
import java.util.*;

/**
 * Linked List Challenge
 * Create a list of places, ordered by distancce from the starting point.
 * Use the ListIterator, both backwards and forwards, through this ordered itinerary of places.
 * >>>
 * First, create a type that has a town or place name, and a field for storing the distance from the start
 * Next, create an itinerary of places or towns to visit, much like we did in the last videos.
 * But this time, instead of Strings, you'll want to create a LinkedList of your place or town type.
 * You'll create a LinkedList, ordered by the distance from the starting point, in this case Sydney.
 * Sydney should be the first element in your list.
 * You don't want to allow duplicates to be in your list, for this data set.
 * ------------------------------------------
 * | Town       | Distance from Sydney (km) |
 * | Adelaide   | 1374                      |
 * | A. Springs | 2771                      |
 * | Brisbane   | 917                       |
 * | Darwin     | 3972                      |
 * | Melbourne  | 877                       |
 * | Perth      | 3923                      |
 * ------------------------------------------
 * >>>
 * In addition, you'll create an interactive program, with the following menu item options:
 * Available actions (select word or letter):
 * (F)orward
 * (B)ackwards
 * (L)ist Places
 * (M)enu
 * (Q)uit
 * >>>
 * Use a Scanner, and the nextLine method, to get input from the console.
 * Use a ListIterator, to move forward and backwards, through the list of places on your itinerary.
 */
public class Main {

    private static int currentPlaceIndex = 0; // index of the current place visited

    public static void main (String[] args) {

        String menuOption;
        boolean exitApp = false;
        LinkedList<Town> itinerary = new LinkedList<>(List.of(
                new Town ("Sydney", 0),
                new Town("Adelaide", 1374),
                new Town("Alice Springs", 2771),
                new Town("Brisbane", 917),
                new Town("Darwin", 3972),
                new Town("Melbourne", 877),
                new Town("Perth", 3923)));

        // order the list
        orderListbydistance(itinerary);

        do {
            // displays Main menu and validates if valid input
            menuOption = getMenuFromScanner();

            switch (menuOption) {
                case "f":
                    forwardList(itinerary);
                    waitEnterToBePressed();
                    break;
                case "b":
                    backwardList(itinerary);
                    waitEnterToBePressed();
                    break;
                case "a":
                    addPlace(itinerary, getPlaceFromScanner());
                    orderListbydistance(itinerary);
                    waitEnterToBePressed();
                    break;
                case "l":
                    listPlaces(itinerary);
                    waitEnterToBePressed();
                    break;
                case "m":
                    // lists menu again
                   break;
                case "q":
                    System.out.println("Thank you for using the application.\nCome again!...");
                    exitApp = true;
                    break;
            }
        } while (!exitApp);
    }

    public static void displayMenu() {

        System.out.print("\n * Available actions (select word or letter):\n" +
                " *\n" +
                " * (F)orward\n" +
                " * (B)ackwards\n" +
                " * (A)dd Place\n" +
                " * (L)ist Places\n" +
                " * (M)enu\n" +
                " * (Q)uit\n" +
                " *\n" +
                " * ->> ");
    }

    public static String getMenuFromScanner() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        String menuOption;
        boolean validMenu = false;

        do {
            displayMenu();
            menuOption = scanner.nextLine();

            try {
                switch(menuOption.toLowerCase()) {
                    case "f", "b", "a", "l", "m", "q":
                        validMenu = true;
                        break;
                    default:
                        System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                        System.out.println("Invalid value! Please try again.\n");
                        break;
                }
            } catch (NumberFormatException badUserData) {
                System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                System.out.println("Invalid input! Please try again.\n");
            }
        } while (!validMenu);

        System.out.println(System.lineSeparator().repeat(50)); // clears the screen

        return menuOption.toLowerCase();
    }

    public static void forwardList(LinkedList<Town> list) {
        if (currentPlaceIndex == list.size() - 1) {
            System.out.printf("You're currently at the farthest point in our journey %s. %n", list.get(currentPlaceIndex));
            System.out.println("The way backwards is ;) Please choose your destination!");
        } else {
            currentPlaceIndex++;
            System.out.printf("Welcome! We have now arrived in %s. %n", list.get(currentPlaceIndex));
        }
    }

    public static void backwardList(LinkedList<Town> list) {
        if (currentPlaceIndex == 0) {
            System.out.printf("You're currently in %s. %n", list.get(currentPlaceIndex));
            System.out.println("Forward is the way ;) Please choose your destination!");
        } else {
            currentPlaceIndex--;
            System.out.printf("Welcome! We have now arrived in %s. %n", list.get(currentPlaceIndex));
        }
    }

    public static void listPlaces(LinkedList<Town> list) {
        System.out.printf("You're currently in %s %n%n", list.get(currentPlaceIndex));
        System.out.println("Places to visit:");

        var iterator = list.listIterator(); // using a List Iterator (additional funcionalities)
        while (iterator.hasNext()) {
            System.out.println(" " + iterator.next().toString());
        }
    }

    public static void addPlace(LinkedList<Town> list, Town place) {

        if (!place.getTownName().isBlank()) {
            for (var myPlace: list) {
                if (myPlace.getTownName().equalsIgnoreCase(place.getTownName())) {
                    System.out.println("\nFound a duplicate: " + place.getTownName());
                    return;
                }
            }
            list.add(place);
        }
    }

    public static void orderListbydistance(LinkedList<Town> list) {

        Town tempTown;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getDistanceFromStart() < list.get(i - 1).getDistanceFromStart()) {
                tempTown = list.get(i);
                list.remove(i);
                list.add(i - 1, tempTown);
                i -= 2;
            }
        }
    }

    public static void waitEnterToBePressed() {
        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPress 'Enter' to continue...");
        scanner.nextLine();
        System.out.println(System.lineSeparator().repeat(50)); // clears the screen
    }

    public static Town getPlaceFromScanner() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);
        Town place = new Town("", 0);

        System.out.println(System.lineSeparator().repeat(50)); // clears the screen
        System.out.print("Enter the Town's name: ");
        String t = scanner.nextLine();
        System.out.print("Enter the distance from the start: ");
        String d = scanner.nextLine();

        try {
            place = new Town(t, Integer.parseInt(d));
        } catch (NumberFormatException e) {
            System.out.println("Invalid value! Please try again.\n");
        }

        return place;
    }
}
