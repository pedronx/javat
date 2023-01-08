package UdemyMasterclass.Section08OOP_Pt2.L111_PolymorphismChallenge;

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
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
