package CodeGym.Level12.L03_StaticMethods;

/**
 * Identical cars
 * In the distant, distant past, all cars had the same name. But then one day the CEO of a car manufacturing plant got tired of the monotony and issued an order: give different names to the car models.
 * As you've already guessed, your task is to help the chief engineer fix the car production program so that each car object can be assigned a unique name.
 * Requirements:
 *   . The modelName field of the Car class must be non-static.
 *   . The getter and setter for the modelName field needs to be fixed.
 */
public class Car {

    private String modelName;
    private int speed;

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
