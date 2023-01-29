package CodeGym.Level13.L04_05_MoreArrayList;

import java.util.ArrayList;

/**
 * Solar System
 * In the year 3020, scientists learned how to grow new planets. One of these synthetic planets was pushed into orbit around the Sun.
 * The planet is located between Earth and Mars.
 * Implement the createNewPlanet(String) method, which should add the new planet to the planets list right after Earth.
 * Take a look at how the order of the planets has changed.
 * The main(), addPlanets() and print() methods are not involved in testing.
 * Requirements:
 *   . The createNewPlanet(String) method should add the new planet to the list of planets at the position after Earth.
 */
public class MainSolarSystem {

    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Death Star");
        print();
    }

    public static void createNewPlanet(String planetName) {

        planets.add(planets.indexOf("Earth") + 1, planetName);
    }

    public static void addPlanets() {
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%s is %dth planet from the Sun%n", planets.get(i), (i + 1));
        }
        System.out.println();
    }
}
