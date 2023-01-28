package CodeGym.Level11.L06_VrsTasks;

/**
 * Getters and setters in action
 * The Coordinate class has 2 getters and 2 setters, but the setters don't assign values to the variables.
 * Figure out why this is happening and fix it. The main method is not checked.
 * Requirements:
 *   . The Coordinate class must have two private non-static int x and y fields.
 *   . The Coordinate class must have a getX getter for the x field.
 *   . The Coordinate class must have a getY getter for the y field.
 *   . The Coordinate class must have a setX(int) setter for the x field.
 *   . The Coordinate class must have a setY(int) setter for the y field.
 *   . The setters must initialize the corresponding fields.
 *   . The setters must initialize the corresponding fields.
 */
public class MainCoordinate {

    public static void main(String[] args) {
        Coordinate coordinate = new Coordinate();
        coordinate.setX(15);
        coordinate.setY(25);
        System.out.println(coordinate.getX());
        System.out.println(coordinate.getY());
    }

}
