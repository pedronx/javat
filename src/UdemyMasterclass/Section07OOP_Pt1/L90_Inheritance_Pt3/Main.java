package UdemyMasterclass.Section07OOP_Pt1.L90_Inheritance_Pt3;

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

        Dog wolf = new Dog("Wolf", 55,
                "Swift", "Long");
        doAnimalStuff(wolf, "fast");

        Fish goldie = new Fish("Goldfish", 0.25, 3, 2);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println(">>>>>>");
    }
}
