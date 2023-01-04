package UdemyMasterclass.Section07OOP_Pt1.L78_SetterMethods;

public class Main {

    public static void main (String[] args) {

        Car car = new Car();

        car.setMake("Citroen");
        car.setModel("C4");
        car.setColour("Grey");
        car.setDoors(5);
        car.setConvertible(true);

        car.describeCar();
    }
}
