package CodeGym.Level11.L03_Initialization;

/**
 * Who here is a descendant?
 * This task is to help you understand how the constructor of a base (parent) class is called.
 * You have the ElectricCar, GasCar, and HybridCar classes, which inherit the Car class.
 * In the constructors of the descendants of the Car class, you need to use super("car type")
 * to pass the type of car to the base (parent) class constructor.
 * To do this, in the main method of the Solution class, create 3 objects: HybridCar, GasCar, and ElectricCar.
 * The output should be as follows (in any order):
 * Hello. I'm a ElectricCar
 * Hello. I'm a GasCar
 * Hello. I'm a HybridCar
 * Requirements:
 *   . The ElectricCar, GasCar, and HybridCar classes should inherit the Car class.
 *   . Don't modify the body of the Car class constructor.
 *   . Descendants of the Car class should call the base class constructor with the appropriate argument.
 *   . In the main method, 3 objects (an instance of the HybridCar, GasCar and ElectricCar classes) should be created.
 *   . The output must match the task conditions.
 */
public class Main {

    public static void main(String[] args) {

        Car hybridCar = new HybridCar("ElectricCar");
        Car gasCar = new GasCar("GasCar");
        Car electricCar = new ElectricCar("HybridCar");
    }
}
