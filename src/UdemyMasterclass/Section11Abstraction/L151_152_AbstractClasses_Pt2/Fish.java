package UdemyMasterclass.Section11Abstraction.L151_152_AbstractClasses_Pt2;

public class Fish extends Animal  {

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("fast")) {
            System.out.print(type + " darting franticly!\n");
        } else {
            System.out.print(type + " lazily swimming!\n");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Goldfish") {
            System.out.print("Swish! ");
        } else {
            System.out.print("Splash! ");
        }
    }
}