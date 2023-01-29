package CodeGym.Level12.L02_StaticVariables;

/**
 * Technical specification: Earth
 * Make all the variables of the Planet class non-static.
 * Then make the necessary changes to the main method.
 * Requirements:
 *   . All variables of the Planet class must be non-static.
 *   . All variables of the Planet object should be assigned values in the main method.
 */
public class MainEarth {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Earth";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
