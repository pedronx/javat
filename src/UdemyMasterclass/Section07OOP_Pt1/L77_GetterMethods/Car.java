package UdemyMasterclass.Section07OOP_Pt1.L77_GetterMethods;

public class Car {

    private String make = "Tesla";
    private String model = "Model-X";
    private String colour = "Red";
    private int doors = 3;
    private boolean convertible = false;

    public void describeCar() {
        System.out.println(make + " " +
                model + " " +
                colour+ " " +
                doors + "-Doors " +
                (convertible ? "Convertible" : ""));
    }

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
}
