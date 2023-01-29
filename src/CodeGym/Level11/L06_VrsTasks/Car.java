package CodeGym.Level11.L06_VrsTasks;

/**
 * Car manufacturer
 * Let's create a listing of the new models we make at our car factory. To do this, we need to create an initialize method that initializes a Car object's fields: model, year of manufacture, and color.
 * Requirements:
 *   . The Car class must have a private String model field.
 *   . The Car class must have a private int year field.
 *   . The Car class must have a private String color field.
 *   . Do not declare any constructors in the Car class.
 *   . The Car class must have a non-static public void initialize method with (String, int, String) parameters.
 *   . The model, year, and color fields must be initialized in the initialize(String model, int year, String color) method.
 */
public class Car {

    private String model;
    private int year;
    private String color;

    public void  initialize(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
}
