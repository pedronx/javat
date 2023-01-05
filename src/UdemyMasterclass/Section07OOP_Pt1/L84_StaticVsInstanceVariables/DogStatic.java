package UdemyMasterclass.Section07OOP_Pt1.L84_StaticVsInstanceVariables;

public class DogStatic {

    private static String name; // static variable

    public DogStatic(String name) {
        DogStatic.name = name;
    }

    public void printName() {
        System.out.println("Name = " + DogStatic.name);
    }
}
