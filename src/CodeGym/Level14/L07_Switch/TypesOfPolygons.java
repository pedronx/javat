package CodeGym.Level14.L07_Switch;

/**
 * Types of polygons
 * The Solution class has a getShapeNameByCornerCount(int) method that returns the name of a polygon depending on the number of its corners. Your task is to rewrite the method using only a switch statement.
 * Requirements:
 *   . The result of the getShapeNameByCornerCount(int) method should not change.
 *   . Only a switch statement should be used in the getShapeNameByCornerCount(int) method.
 */
public class TypesOfPolygons {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCornerCount(3));
        System.out.println(getShapeNameByCornerCount(5));
        System.out.println(getShapeNameByCornerCount(1));
    }

    public static String getShapeNameByCornerCount(int cornerCount) {
        String shape;
        switch (cornerCount) {
            case 3:
                shape = "Triangle";
                break;
            case 4:
                shape = "Quadrangle";
                break;
            case 5:
                shape = "Pentagon";
                break;
            case 6:
                shape = "Hexagon";
                break;
            case 7:
                shape = "Heptagon";
                break;
            case 8:
                shape = "Octagon";
                break;
            default:
                shape = "Other shape";
                break;
        }
        return shape;
    }
}
