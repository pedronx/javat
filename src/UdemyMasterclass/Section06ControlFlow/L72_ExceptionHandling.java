package UdemyMasterclass.Section06ControlFlow;

import java.util.Scanner;

public class L72_ExceptionHandling {

    public static void main (String[] args) {
        /*
        String currentYear = "2023";
        String userDateOfBirth = "1999";

        System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(userDateOfBirth)));

        String userAgeWithPartialYear = "24.5";
        System.out.println("Partial age = " + Double.parseDouble(userAgeWithPartialYear));
         */

        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    /**
     * Use System.console().readLine
     * Run the program from Terminal:
     * java src/UdemyMasterclass/Section06ControlFlow/L71_ExceptionHandling.java
      */
    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");

        return "So you are " + (currentYear - Integer.parseInt(dateOfBirth)) + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        // Instantiate a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's you name?");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", thanks for taking the course!");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("What year were you born? (Between " + (currentYear - 125) + " and " + currentYear + ").");
            String dateOfBirth = scanner.nextLine();

            // catch the exceptions if user enters characters
            try {
                age = checkData(currentYear, dateOfBirth);
                if (age < 0) {
                    System.out.println("Invalid Value! PLease try again.");
                } else {
                    validDOB = true;
                }
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed! Please try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    // Validate data entered by user
    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }

        return (currentYear - dob);
    }
}
