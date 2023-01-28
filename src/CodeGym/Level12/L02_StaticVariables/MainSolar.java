package CodeGym.Level12.L02_StaticVariables;

/**
 * The Solar System is our home
 * This program displays basic facts about the solar system.
 * Rewrite the code so that all the variables of the SolarSystem class
 * are used in the output, but the output of the program does not change.
 * Expected output:
 * Humanity lives in the Solar System.
 * It is approximately 4568200000 years old.
 * The Solar System has 8 known planets.
 * Like most planetary systems, it has 1 star.
 * The star's name is the Sun.
 * The distance to the center of the galaxy is 27170 light years.
 * Each inhabitant of the Solar System should know this information!
 * Requirements:
 *   . The program should display the text specified in the example.
 *   . When displaying text, you should use all the variables of the SolarSystem class.
 */
public class MainSolar {

    public static void main(String[] args) {

        System.out.println("Humanity lives in the Solar System.");
        System.out.printf("It is approximately %d years old.\n", SolarSystem.age);
        System.out.printf("The Solar System has %d known planets.\n", SolarSystem.planetsCount);
        System.out.printf("Like most planetary systems, it has %d star.\n", SolarSystem.starsCount);
        System.out.printf("The star's name is the %s.\n", SolarSystem.starName);
        System.out.printf("The distance to the center of the galaxy is %d light years.\n", SolarSystem.distanceToGalacticCenter);
        System.out.println("Each inhabitant of the Solar System should know this information!");

    }
}
