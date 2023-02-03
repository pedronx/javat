package CodeGym.Level14.L08_ExtraCollections;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListClass {

    public static void main(java.lang.String[] args) {

        // LinkedList
        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Canada");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println(earlBio);


        // add string to index 3
        String str5 = new String("I enjoy music");
        earlBio.add(3, str5);
        System.out.println("\n" + earlBio);

        // remove string from index 2
        earlBio.remove(2);
        System.out.println("\n" + earlBio);

        System.out.println("-".repeat(15));

        // addFirst() & addLast()
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println("\nAdded new cars: first and last");
        System.out.println(cars);

        // peekFirst(), peekLast()
        System.out.print("\nPeek first car: " + cars.peekFirst());
        System.out.print("\nPeek last car: " + cars.peekLast());

        // pollFirst(), pollLast()
        System.out.println("\n\nReturn and remove first car: " + cars.pollFirst());
        System.out.println("Return and remove last car: " + cars.pollLast());

        System.out.println ("\nWhat's left on the list?");
        System.out.println(cars);

        // toArray(): This method returns an array containing the list items
        Car[] carsArray = cars.toArray(new Car[3]);
        System.out.println ("\nConverted to ArrayList:");
        System.out.println(Arrays.toString(carsArray));
    }
}

class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

}