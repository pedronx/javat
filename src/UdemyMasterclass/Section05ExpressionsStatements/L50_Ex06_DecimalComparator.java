package UdemyMasterclass.Section05ExpressionsStatements;

/**
 * DecimalComparator
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 * The method should return boolean and it needs to return true if two double numbers
 * are the same up to three decimal places. Otherwise, return false.
 * >>>
 * EXAMPLES OF INPUT/OUTPUT:
 *    . areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places.
 *    . areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
 *    . areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places.
 *    . areEqualByThreeDecimalPlaces(-3.123, 3.123); should return false since numbers are not equal up to 3 decimal places.
 * >>>
 * TIP: Use paper and pencil.
 * TIP: Use casting.
 * NOTE: The areEqualByThreeDecimalPlaces method needs to be defined as public static like we have been doing so far in the course.
 * NOTE: Do not add a main method to solution code.
 */
public class L50_Ex06_DecimalComparator {

    public static void main (String[] args) {
        System.out.println("-3.1756, -3.175 : " + areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("3.175, 3.176 : " + areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println("3.0, 3.0 : " + areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("-3.123, 3.123 : " + areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println("0, 0 : " + areEqualByThreeDecimalPlaces(0, 0));
    }

    /**
     * The method returns true if two double numbers
     *  are the same up to three decimal places.
     *  Otherwise, it returns false.
     */
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        boolean isEqual = false;

        if ((int)(numberOne * 1000) == (int)(numberTwo * 1000)) {
            isEqual = true;
        }

        return isEqual;
    }
}
