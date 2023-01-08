package UdemyMasterclass.Section08OOP_Pt2.L111_112_PolymorphismChallenge;

/**
 * Polymorphism Challenge
 *
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        System.out.println(car.getDescription());
        runRace(car);

        System.out.println(">>>>>>");
        Car ferrari = new GasPoweredCar("2023 Red Ferrari 26 GTS", 15.4, 6);
        System.out.println(ferrari.getDescription());
        runRace(ferrari);

        System.out.println(">>>>>>");
        Car tesla = new ElectricCar("2020 Tesla Model X");
        System.out.println(tesla.getDescription());
        runRace(tesla);

        System.out.println(">>>>>>");
        Car teslaTwo = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        System.out.println(teslaTwo.getDescription());
        runRace(teslaTwo);

        System.out.println(">>>>>>");
        Car toyota = new HybridCar("2022 Black Toyota Cupra", 900, 560, 9);
        System.out.println(toyota.getDescription());
        runRace(toyota);
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
