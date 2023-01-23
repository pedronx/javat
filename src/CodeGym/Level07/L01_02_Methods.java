package CodeGym.Level07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class L01_02_Methods {

    public static void main (String[] args) {

//        separateConcepts(); // L01 Task 01
//        orderlyInformation(); // L01 Task 02
//        favoriteDish(); // L02 Task 01
//        theLiverpool4(); // L02 Task 02
        correctOrder(); // L02 Task 03
    }

    /**
     * Separate concepts
     * The main method prints too many lines of information about various concepts.
     * It would make sense to separate displaying information about hydrogen from displaying information about the island of Java by separating them into different methods.
     * >>>
     * Create a public static void printHydrogenInfo() method, which should print all the lines about hydrogen.
     * Also, create a public static void printJavaInfo() method, which should print all the lines about the island of Java.
     * Finally, in the main() method, call these two methods.
     * >>>
     * The general console output shouldn't change.
     * Requirements:
     *   . There must be a public static void printHydrogenInfo() method.
     *   . There must be a public static void printJavaInfo() method.
     *   . The printHydrogenInfo() method should print all existing lines about hydrogen.
     *   . The printJavaInfo() method should print all existing lines about the island of Java.
     *   . The main() method must call the printHydrogenInfo() and printJavaInfo() methods.
     *   . The general console output shouldn't change.
     */
    public static void separateConcepts() {

        printHydrogenInfo();
        printJavaInfo();
    }

    public static void printHydrogenInfo() {

        System.out.println("Hydrogen:");
        System.out.println("This is a chemical element in the periodic table. Its designation is H, and its atomic number is 1.");
        System.out.println("It is the lightest element in the table.");
        System.out.println("Hydrogen is used in:");
        System.out.println("- the chemical industry");
        System.out.println("- the oil refining industry");
        System.out.println("- aviation");
        System.out.println("- power generation.");
    }

    public static void printJavaInfo() {
        System.out.println("Island of Java:");
        System.out.println("It is part of Indonesia.");
        System.out.println("The states of Mataram, Majapahit, and Demak originated on the island.");
        System.out.println("Java is the most populated island in the world:");
        System.out.println("The total population is 140 million people.");
        System.out.println("The population density is 1,061 people per square kilometer.");
        System.out.println("Kopi luwak, a famous variety of coffee, is produced here.");
    }


    /**
     * Orderly information
     * Here is a bad example of using methods:
     *   . The methods split up a couplet.
     *   . It's not worth it to wrap a single line of code in a separate method.
     * >>>
     * Rewrite the code so that all text is displayed in the main method, and the rest of the methods are removed.
     * The execution of the program should not change.
     * Requirements:
     *   . The main() method should be the only method in the Solution class.
     *   . The console output must match the task conditions.
     */
    public static void orderlyInformation() {

        System.out.println("For sweetest things turn sourest by their deeds;");
        System.out.println("Lilies that fester smell far worse than weeds.");
    }


    /**
     * Favorite dish
     * Rename the parameters of the rintPersonInfo() method:
     *   .  firstName to name;
     *   . lastName to surname;
     *   . favoriteDish to meal;
     * without changing the program's functionality.
     * Leave the variable names in the main() method unchanged.
     * Requirements:
     *   . The parameters of the printPersonInfo() method must be named name, surname, and meal.
     *   . The console output must match the task conditions.
     *   . In the main() method, the firstName, lastName, and favoriteDish should remain unchanged.
     */
    public static void favoriteDish() {

        String firstName = "Olivia";
        String lastName = "Klinger";
        String favoriteDish = "Spaghetti";
        printPersonInfo(firstName, lastName, favoriteDish);
    }

    public static void printPersonInfo(String name, String surname, String meal) {
        System.out.println("Short dossier:");
        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Favorite dish: " + meal);
    }


    /**
     * The Liverpool 4
     * The createCrew() method displays the positions and names of the crew members on a spacecraft.
     * To avoid any confusion inside the method, change the names of the createCrew() method's parameters to match the names of the variables passed to the method:
     *   . name1 to navigator
     *   . name2 to pilot
     *   . name3 in secondPilot
     *   . name4 to flightEngineer
     * And there should be no change to the execution of the program.
     * Requirements:
     *   . The createCrew() method's parameters must be named navigator, pilot, secondPilot, and flightEngineer.
     *   . The console output must match the task conditions.
     *   . In the main() method, the navigator, pilot, secondPilot, and flightEngineer variables should remain unchanged.
     */
    public static void theLiverpool4() {

        String navigator = "John";
        String pilot = "Paul";
        String secondPilot = "George";
        String flightEngineer = "Ringo";
        createCrew(navigator, pilot, secondPilot, flightEngineer);
    }

    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer) {
        System.out.println("The four who are to conquer the cosmos:");
        System.out.println("Navigator: " + navigator);
        System.out.println("Pilot: " + pilot);
        System.out.println("Second pilot: " + secondPilot);
        System.out.println("Flight engineer:" + flightEngineer);
    }


    /**
     * Correct order
     * Let's write a utility for working with arrays. The main functionality is ready: the printArray() method displays all the elements of the array on the console.
     * What is left for you is just a trifle: implement the reverseArray() method. It should reverse the order of the elements in the array.
     * The method should only work with arrays of integer values (int[]).
     * Example:
     * If the array contains the elements:
     * 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
     * then after calling the reverseArray() method it should contain:
     * 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
     * Requirements:
     *   . The reverseArray() method must reverse the order of the elements in the array.
     */
    public static void correctOrder() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {

        int[] arrayCopy = Arrays.copyOf(array, array.length);

        for (int i = 0; i < array.length; i++) {
            array[i] = arrayCopy[(array.length - 1) - i];
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
