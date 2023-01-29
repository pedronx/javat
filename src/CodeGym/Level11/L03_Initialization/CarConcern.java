package CodeGym.Level11.L03_Initialization;

/**
 * Need for speed
 * Imagine yourself as a car manufacturer and find a solution that get the factory working again. To do this, you need to add the initialization of fields in the constructors with the corresponding parameters. If a parameter is absent, then you need to initialize the field with the default value. For the year field, this is the current year (4321), and for the color field, it is Orange.
 * Requirements:
 *   . The CarConcern class must have four private final fields.
 *   . The CarConcern class must have a public constructor that has three parameters and initializes the corresponding fields.
 *   . The CarConcern class must have a public constructor that has two parameters and initializes the corresponding fields.
 *   . The CarConcern class must have a public constructor that has one parameter and initializes the corresponding fields.
 */
public class CarConcern {

    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public CarConcern(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}
