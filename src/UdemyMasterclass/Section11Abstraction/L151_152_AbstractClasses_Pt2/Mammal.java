package UdemyMasterclass.Section11Abstraction.L151_152_AbstractClasses_Pt2;

/**
 * An abstract class that extends another abstract class has some flexibility
 * . It can implement all of the parent's abstract methods
 * . It can implement some of them
 * . It can implemenet none of them
 * It can also include additional abstract methods, which will force subclasses to implement
 * both Animal's abstract methods, as well as Mammal's.
 */
public abstract class Mammal extends Animal {

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks!" : "runs!");
    }

    public abstract void shedHair();
}
