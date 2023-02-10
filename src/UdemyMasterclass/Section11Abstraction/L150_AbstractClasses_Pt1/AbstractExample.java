package UdemyMasterclass.Section11Abstraction.L150_AbstractClasses_Pt1;

abstract class AnimalExample { // abstract class

    public abstract void move(); // abstract method is declared with modifier abstract
}

abstract class MammalExample extends AnimalExample { // Animal is abstract, Mammal is also abstract
}

class DogExample extends AnimalExample { // Dog is not abstract -> concrete method

    public void move(){ // the subclass mut provide a concrete method
                        // for any abstract method declared on its parent
                        // it won't compile otherwise
    }
}

abstract class BestOfBreed extends DogExample { // BestOfBreed can be abstract (although Dog is not)
}