package UdemyMasterclass.Section11Abstraction.L155_157_Interfaces;

public class Truck implements Trackable {

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates are recorded.");
    }
}
