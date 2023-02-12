package UdemyMasterclass.Section11Abstraction.L155_157_Interfaces;

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

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
