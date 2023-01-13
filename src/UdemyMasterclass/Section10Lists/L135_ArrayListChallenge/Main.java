package UdemyMasterclass.Section10Lists.L135_ArrayListChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The ArrayList Challenge
 * The challenge is to reate an interactive console program.
 * And give the user a menu of options as shown here:
 *   0 - to shut down
 *   1 - to add item(s) to list (comma delimited list)
 *   2 - to remove any items (comma delimited list)
 *   Enter a number for which action you want to perform:
 * >>>
 * Using the scanner class, solicit a menu item, 0, 1 or 2, and process the item accordingly
 * Your grocery list should be an ArrayList
 * You should use methods on the ArrayList, to add items, remove items,
 * check if an item is already in the list, and print a sorted list.
 * You should print the list, sorted alphabetically, after each operation
 * you shouldn't allow duplicate items on the list
 */
public class Main {

    public static void main (String[] args) {

        int menuOption = getMenuFromScanner();
        ArrayList<String> groceryList = getArrayListFromScanner();

    }


    public static int getMenuFromScanner() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        boolean validDOB = false;

        do {
            displayMenu();
            String menuOption = scanner.nextLine();

            // catch the exceptions if user enters characters
            try {
                menu = checkData(menuOption);

                switch(menu) {
                case 0, 1, 2:
                    validDOB = true;
                    break;
                default:
                    System.out.println("Invalid Value! PLease try again.");
                    break;
                };
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid input! Please try again.");
                System.out.println(System.lineSeparator().repeat(50)); // clears the screen
            }
        } while (!validDOB);

        System.out.println(System.lineSeparator().repeat(50)); // clears the screen

        return menu;
    }

    // Validate data entered by user
    public static int checkData(String menuOption) {
        int menu = Integer.parseInt(menuOption);

        if (menu < 0 || menu > 3) {
            return -1;
        }

        return menu;
    }

    public static void displayMenu() {
        System.out.print(" *   0 - to shut down\n" +
                " *   1 - to add item(s) to list (comma delimited list)\n" +
                " *   3 - to remove any items (comma delimited list)\n" +
                " *   Enter a number for which action you want to perform: ");
    }

    public static void insertItems() {

    }

    public static void removeItems() {
        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert the item(s) (comma delimited list): ");
    }

    public static ArrayList<String> getArrayListFromScanner() {

        ArrayList<String> groceryList = new ArrayList<>((List.of("Test")));

        return groceryList;
    }
}
