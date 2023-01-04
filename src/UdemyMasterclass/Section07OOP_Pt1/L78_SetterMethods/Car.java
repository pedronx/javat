package UdemyMasterclass.Section07OOP_Pt1.L78_SetterMethods;

public class Car {

    private String make;
    private String model;
    private String colour;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(make + " " +
                model + " " +
                colour+ " " +
                doors + "-Doors " +
                (convertible ? "Convertible" : ""));
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDoors(int numberOfDoors) {
        this.doors = numberOfDoors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}