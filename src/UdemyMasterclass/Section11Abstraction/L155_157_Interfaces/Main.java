package UdemyMasterclass.Section11Abstraction.L155_157_Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird(); // usual declaration of a new instance
        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;

        System.out.println();

        animal.move();
        bird.move();
//        flier.move(); // won't compile
//        tracked.move(); // won't compile

        flier.takeOff();
        flier.fly();
        flier.land();
        tracked.track();

        System.out.println();
        inFlight(flier);

        /*--------------------------------*/
        System.out.println();
        inFlight(new Jet());

        /*--------------------------------*/
        System.out.println();
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("%nThe truck traveled %.2f km or %.2f miles%n", kmsTraveled, milesTraveled);

        /*--------------------------------*/
//        ArrayList<FlightEnabled> newFliers = new ArrayList<>();
//        newFliers.add(bird);

        List<FlightEnabled> betterFliers = new LinkedList<>(); // better implementation (interface type)
        betterFliers.add(bird);

        LinkedList<FlightEnabled> superFliers = new LinkedList<>();
        superFliers.add(bird);

//        // 1st -> call using ArrayList<>
//        triggerFliers(newFliers);
//        flyFliers(newFliers);
//        landFliers(newFliers);

        // 2nd -> call using List<>
        System.out.println();
        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

        // 3nd -> call using LinkedList<>
        System.out.println();
        triggerFliers(superFliers);
        flyFliers(superFliers);
        landFliers(superFliers);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }

    // using List<> as parameter (can also accept LinkedList<>)
    private static void triggerFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.takeOff();
        }
    }

    private static void flyFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.fly();
        }
    }

    private static void landFliers(List<FlightEnabled> fliers) {

        for (var flier : fliers) {
            flier.land();
        }
    }
}
