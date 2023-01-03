package UdemyMasterclass.Section06ControlFlow;

public class L70_ReadingUserInput {

    public static void main (String[] args) {
        /*
        String currentYear = "2023";
        String userDateOfBirth = "1999";

        System.out.println("Age = " + (Integer.parseInt(currentYear) - Integer.parseInt(userDateOfBirth)));

        String userAgeWithPartialYear = "24.5";
        System.out.println("Partial age = " + Double.parseDouble(userAgeWithPartialYear));
         */

        int currentYear = 2022;

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));
    }

    /**
     * Use System.console().readLine
     * Run the program from Terminal:
     * java src/UdemyMasterclass/Section06ControlFlow/L70_ReadingUserInput.java
      */


    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi " + name + ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");


        return "So you are " + (currentYear - Integer.parseInt(dateOfBirth)) + " years old";
    }

    public static String getInputFromScanner(int currentYear) {

        return "";
    }
}
