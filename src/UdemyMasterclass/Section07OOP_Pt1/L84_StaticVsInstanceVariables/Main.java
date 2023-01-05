package UdemyMasterclass.Section07OOP_Pt1.L84_StaticVsInstanceVariables;

public class Main {

    public static void main (String[] args) {

        // Static variables
        DogStatic rex = new DogStatic("Rex");
        DogStatic fluffy = new DogStatic("Fluffy");

        rex.printName();    // prints Fluffy (due to static variable)
        fluffy.printName(); // prints Fluffy

        // Instance variables
        DogInstance rexTwo = new DogInstance("Rex");
        DogInstance fluffyTwo = new DogInstance("Fluffy");

        System.out.println(">>>>>>");
        rexTwo.printName(); // prints Rex
        fluffyTwo.printName(); // prints Fluffy
    }
}
