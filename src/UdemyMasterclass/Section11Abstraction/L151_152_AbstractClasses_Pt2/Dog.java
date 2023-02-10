package UdemyMasterclass.Section11Abstraction.L151_152_AbstractClasses_Pt2;

public class Dog extends Animal  {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equalsIgnoreCase("fast")) {
            System.out.print(type + " running!\n");
        } else {
            System.out.print(type + " walking!\n");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf") {
            System.out.print("Howling! ");
        } else {
            System.out.print("Woof! ");
        }
    }
}