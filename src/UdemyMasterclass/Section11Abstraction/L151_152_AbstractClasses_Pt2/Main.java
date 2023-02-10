package UdemyMasterclass.Section11Abstraction.L151_152_AbstractClasses_Pt2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        Animal animal = new Animal("animal", "big", 100); // won't compile, abstract class cannot be instantiated

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();

        System.out.println();
        doAnimalStuff(dog);

        System.out.println();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German sheppard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 10));
        animals.add(new Fish("Barracuda", "enormous", 15000));
        animals.add(new Dog("Pug", "small", 75));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

        System.out.println("\n");
        for(Animal animal : animals) {
            System.out.println("Explicit type: " + animal.getExplicitType());
        }

    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("slow");
    }
}
