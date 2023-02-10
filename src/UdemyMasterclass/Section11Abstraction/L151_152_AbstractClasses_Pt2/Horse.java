package UdemyMasterclass.Section11Abstraction.L151_152_AbstractClasses_Pt2;

public class Horse extends Mammal {

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }
    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring!");
    }
}
