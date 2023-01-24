package CodeGym.Level07;

public class L05_06_Variables {

    /*--- Lesson 5 | Task 02 ---*/
    public static String city = "Tokyo";
    public static double population = 34.5;

    /*--- Lesson 6 | Task 01 ---*/
    public static final double pi = 3.14;
    public static double radius = 2.5;
    public static final double diameter = 5;

    /*--- Lesson 6 | Task 03 ---*/
    public String name = "Amigo";
    public String position = "Java developer";
    public int salary = 10_000;

    public static void main (String[] args) {

        // Lesson 05 | Task 01
//        int[] array = {15, 64, 9, 51, 42};
//        printSqrt(array);

        // Lesson 05 | Task 02
//        printCityPopulation("Jakarta", 25.3);
//        printCityPopulation("Seoul", 25.2);
//        printCityPopulation("Delhi", 23.1);
//        printCityPopulation("New York City", 21.6);

        // Lesson 06 | Task 01
        areaAndPerimeter();
    }

    /**
     * Everything has a root
     * The printSqrt(int[] array) method should print the square root of each element in the passed array.
     * But this isn't happening due to conflicting variable names. Correct the variable names so that the code compiles.
     * The program should display a suitable line on the console for each element of the array.
     * Example of a line:
     * The square root of 64 is 8.0
     * Requirements:
     *   . The code must compile.
     *   . For each element in the array, the printSqrt(int[] array) method must print a string in accordance with the task conditions.
     */
    public static void printSqrt(int[] array) {
        String squareText = "The square root of ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(squareText + element + " is " + elementSqrt);
        }
    }

    /**
     * Giant cities
     * The program should display the population of the largest cities in the world
     * and compare them with Tokyo, the most populous city of all.
     * But the program's algorithm is slightly broken. To correct the error,
     * you need to make it so the line that displays information about the world's largest city
     * uses static class variables instead of local method arguments.
     * >>>
     * When the program is working correctly, the output should be as follows:
     * The population of Jakarta is 25.3 million.
     * But in the most populous city, Tokyo, the population is 34.5 million.
     * The population of Seoul is 25.2 million.
     * But in the most populous city, Tokyo, the population is 34.5 million.
     * The population of Delhi is 23.1 million.
     * But in the most populous city, Tokyo, the population is 34.5 million.
     * The population of New York City is 21.6 million.
     * But in the most populous city, Tokyo, the population is 34.5 million.
     * Requirements:
     *   . You cannot change the names of the variables.
     *   . The class's static city and population variables should be used to display information about the most populous city.
     *   . The program's console output must match the task conditions.
     */
    public static void printCityPopulation(String city, double population) {
        System.out.println("The population of " + city + " is " + population + " million.");
        System.out.println("But in the most populous city, " + L05_06_Variables.city
                + ", the population is " + L05_06_Variables.population + " million.");
    }

    /**
     * Remembering geometry
     * Take a look at what the program does. Add the final modifier to standard constants (variables with immutable values).
     * Requirements:
     *   . The final modifier must be set on all constants.
     */
    public static void areaAndPerimeter() {
        System.out.println("The area of the circle is: " + pi * radius * radius);
        System.out.println("The perimeter of the circle is: " + pi * diameter);
    }

    /**
     * Everything you need to know about Earth
     * Here is the Earth class — a collection of variables that describe certain characteristics of the planet Earth.
     * Be sure that the variables of the Earth class are global constants.
     * Don't forget to rename the variables so that they comply with code style conventions for global variables.
     * Requirements:
     *   . The Earth class's name variable needs to be changed into a global variable.
     *   . The Earth class's square variable needs to be changed into a global variable.
     *   . The Earth class's population variable needs to be changed into a global variable.
     *   . The Earth class's equatorLength variable needs to be changed into a global variable.
     */
    public class Earth {
        public static final String NAME = "Earth";
        public static final double SQUARE = 510_100_000.0;
        public static final long POPULATION = 7_594_000_000L;
        public static final long EQUATOR_LENGTH = 40_075_696L;
    }

    /**
     * Employee records
     * Here you have in front of you a digital employee record. It contains the employee's name, position and salary.
     * The name of the employee is unlikely to change, but his or her position and salary might.
     * These changes are made using the setPosition() and setSalary() methods. Of course, they are not working correctly at present.
     * Figure out the reason and fix the bugs. In doing this, neither the names of instance variables, nor the names of method parameters can be changed.
     * Requirements:
     *   . The setPosition() method must set the passed value to the position instance variable.
     *   . The setSalary() method must set the passed value to the salary instance variable.
     *   . You cannot change the names of the instance variables.
     *   . You cannot change the names of method parameters.
     */
    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
