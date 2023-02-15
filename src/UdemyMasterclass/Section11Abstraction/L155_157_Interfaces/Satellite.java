package UdemyMasterclass.Section11Abstraction.L155_157_Interfaces;

enum FlightStages implements Trackable {GROUNDED, LAUCH, CRUISE, DATA, COLLECTION;
    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.printf("Monitoring " + this);
        }
    }
}
interface OrbithEarth extends FlightEnabled {

    void achieveOrbit();
}

public class Satellite implements OrbithEarth {

    public void achieveOrbit(){
        System.out.printf("Orbit is achieved!");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
