package CodeGym.Level14.L08_ExtraCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListClass {

    public static void main(String[] args) {

        // sort() method for sorting the contents of collections alphabetically
        sort();

        System.out.println("-".repeat(15));

        // min() and max() methods
        minAndMax();

        System.out.println("-".repeat(15));

        // reverse the order of a Collection
        reverse();

        System.out.println("-".repeat(15));

        // shuffle the order of a Collection
        shuffle();

        System.out.println("-".repeat(15));

        // swap() method - pass a list and indices of the two elements that need to be swapped
        // Note that the method works with indices, not references.
        swap();

        System.out.println("-".repeat(15));

        // If two lists have completely different elements, the program outputs true.
        disjoint();
    }

    public static void sort() {

        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        System.out.print("Solar system: ");
        System.out.println(solarSystem);
    }

    public static void minAndMax() {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("Array of numbers: " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
    }

    public static void reverse() {
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));
        Collections.sort(solarSystem);
        Collections.reverse(solarSystem);
        System.out.print("Solar system reversed: ");
        System.out.println(solarSystem);
    }

    public static void shuffle() {

        ArrayList<Integer> bingoDrum = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++) {

            bingoDrum.add(i);// add the numbers 1 to 100 to the drum
        }

        Collections.shuffle(bingoDrum);// Mix it up
        System.out.println ("Your attention, please! Here are the first 10 numbers from the drum!");
        for (int i = 0; i < 10; i++) {

            System.out.println(bingoDrum.get(i));
        }
    }

    public static void swap() {
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth, mars
                , jupiter, saturn, uranus, mercury));// The planets are in the wrong order
        System.out.print("Solar system:\n");
        System.out.println(solarSystem);

        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
        System.out.println("\nSolar system (Swapped Mercury and Neptune): ");
        System.out.println(solarSystem);
    }

    public static void disjoint() {
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));

        System.out.print("Solar system 1: " + solarSystemPart1);

        System.out.print("\n\nSolar system 2: " + solarSystemPart2);
        System.out.print("\n\nDisjoint: " + Collections.disjoint(solarSystemPart1, solarSystemPart2));
    }
}
