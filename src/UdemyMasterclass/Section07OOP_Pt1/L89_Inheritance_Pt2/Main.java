package UdemyMasterclass.Section07OOP_Pt1.L89_Inheritance_Pt2;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog("Mutt", 50, "Ab", "Cd");
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");


    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println(">>>>>>");
    }
}
