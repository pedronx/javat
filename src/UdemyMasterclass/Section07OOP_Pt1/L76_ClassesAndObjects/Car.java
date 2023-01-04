package UdemyMasterclass.Section07OOP_Pt1.L76_ClassesAndObjects;

public class Car {

    private String make;
    private String model;
    private String colour;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(doors + "-Doors" +
                colour+ " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
