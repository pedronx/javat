package UdemyMasterclass.Section11Abstraction.L155_157_Interfaces;

/**
 * Interface
 * If we omit an access modifier on an interface member, it's implicitly public
 */
interface FlightEnabled {
    double MILES_TO_KM = 1.60934; // implicitly public , static & final (constants)
    double KM_TO_MILES = 1.60934;
    public abstract void takeOff(); // public abstract is redundant

    abstract void land(); // abstract is redundant

    void fly(); // abstract modifier is implicit, for all interfaces
}

interface Trackable {

    void track();
}

public abstract class Animal {

    public abstract void move();
}
