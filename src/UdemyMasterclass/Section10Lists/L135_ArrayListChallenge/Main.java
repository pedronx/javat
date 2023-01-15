package UdemyMasterclass.Section10Lists.L135_ArrayListChallenge;

import java.util.ArrayList;
import java.util.Comparator;
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

        int menuOption = 0;
        boolean exitApp = false;
        ArrayList<String> groceryList = new ArrayList<>();

        do {
            // displays Main menu and validates if valid input
            menuOption = getMenuFromScanner();

            switch (menuOption) {
                case 0:
                    System.out.println("Thank you for using the application.\nCome again!...");
                    exitApp = true;
                    break;
                case 1:
                    System.out.print("Insert the values (comma delimited list): ");
                    ArrayList<String> scannerList = getArrayListFromScanner();
                    groceryList = insertItems(groceryList, scannerList);

                    System.out.print("List: " + groceryList + "\n\n");
                    System.out.print("Press 'Enter' to continue...");
                    getArrayListFromScanner(); // waiting for any key to be pressed
                    System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                    break;
                case 2:
                    System.out.print("Insert the values (comma delimited list): ");
                    ArrayList<String> removalList = getArrayListFromScanner();
                    groceryList = removeItems(groceryList, removalList);
                    System.out.print("List: " + groceryList + "\n\n");
                    System.out.print("Press 'Enter' to continue...");
                    getArrayListFromScanner(); // waiting for any key to be pressed
                    System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                    break;
            }
        } while (!exitApp);
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
                menu = checkMenuData(menuOption);

                switch(menu) {
                case 0, 1, 2:
                    validDOB = true;
                    break;
                default:
                    System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                    System.out.println("Invalid value! PLease try again.\n");
                    break;
                };
            } catch (NumberFormatException badUserData) {
                System.out.println(System.lineSeparator().repeat(50)); // clears the screen
                System.out.println("Invalid input! Please try again.\n");
            }
        } while (!validDOB);

        System.out.println(System.lineSeparator().repeat(50)); // clears the screen

        return menu;
    }

    // Validate data entered by user
    public static int checkMenuData(String menuOption) {
        int menu = Integer.parseInt(menuOption);

        if (menu < 0 || menu > 3) {
            return -1;
        }

        return menu;
    }

    public static void displayMenu() {

        System.out.print(" *   Available actions:\n" +
                " *\n" +
                " *   0 - to shut down\n" +
                " *\n" +
                " *   1 - to add item(s) to list (comma delimited list)\n" +
                " *\n" +
                " *   2 - to remove any items (comma delimited list)\n" +
                " *\n" +
                " *   Enter a number for which action you want to perform: ");
    }

    // Receives 1 original list and 1 List with new elements
    // Inserts new elements (verifies if duplicates) and sorts
    public static ArrayList<String> insertItems(ArrayList<String> groceryList, ArrayList<String> scannerList) {

        System.out.print("Input: ");
        for (int i = 0; i < scannerList.size(); i++) {

            System.out.print(scannerList.get(i) + " ");
            if (scannerList.get(i).isBlank() || scannerList.get(i).isEmpty() || groceryList.contains(scannerList.get(i))) {
                continue;
            } else {

                groceryList.add(scannerList.get(i).trim());
            }
        }
        System.out.println();
        groceryList.sort(Comparator.naturalOrder());

        return groceryList;
    }

    // Receives 1 original list and 1 List with elements to remove
    // Removes elements from the original list
    public static ArrayList<String> removeItems(ArrayList<String> groceryList, ArrayList<String> removalList) {

        System.out.print("Input: ");
        for (int i = 0; i < removalList.size(); i++) {

            System.out.print(removalList.get(i) + " ");

            if (groceryList.contains(removalList.get(i).trim())) {
                groceryList.remove(removalList.get(i).trim());
            }
        }
        System.out.println();
        groceryList.sort(Comparator.naturalOrder());

        return groceryList;
    }

    public static ArrayList<String> getArrayListFromScanner() {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        String items = scanner.nextLine();

        ArrayList<String> scannerList = new ArrayList<>((List.of(items.split(","))));

        return scannerList;
    }
}
