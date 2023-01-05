package UdemyMasterclass.Section07OOP_Pt1.L83_ReferenceObjectInstanceClass;

public class Main {

    public static void main (String[] args) {

        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;

        System.out.println(blueHouse.getColour()); // prints blue
        System.out.println(anotherHouse.getColour()); // blue

        anotherHouse.setColour("red"); // reference to blueHouse, updates the existing object
        System.out.println(">>>>>>");
        System.out.println(blueHouse.getColour()); // red
        System.out.println(anotherHouse.getColour()); // red

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(">>>>>>");
        System.out.println(blueHouse.getColour()); // red
        System.out.println(anotherHouse.getColour()); // green
        System.out.println(greenHouse.getColour()); // green
    }
}
