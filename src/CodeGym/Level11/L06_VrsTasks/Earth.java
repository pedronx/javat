package CodeGym.Level11.L06_VrsTasks;

import CodeGym.Level11.L06_VrsTasks.Continents.*;

/**
 * Creating the continents
 * According to one classification, there are 6 continents on planet Earth. Create a class for each continent. Each class must have a field that stores the area of the corresponding continent.
 * The area of the continent must be specified when it is created, and it must be immutable.
 * You can use any numbers to specify the area of the continents.
 * Requirements:
 *   . In separate files, create public Africa, Antarctica, Australia, Eurasia, NorthAmerica, and SouthAmerica classes.
 *   . Each of the created classes must have a private final int field named area.
 *   . Each of the created classes must have a public constructor with an int parameter that is used to initialize the area field.
 *   . In the main method of the Earth class, create 6 different continents and pass area values to them.
 */
public class Earth {

    public static void main(String[] args) {

        Africa africa = new Africa(10_234);
        Antarctica antartica = new Antarctica(11_734);
        Australia australia = new Australia(12_235);
        Eurasia eurasia = new Eurasia(13_761);
        NorthAmerica northAmerica = new NorthAmerica(14_5276);
        SouthAmerica southAmerica = new SouthAmerica(15_023);

    }
}
