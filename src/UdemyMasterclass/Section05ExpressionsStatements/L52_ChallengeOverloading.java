package UdemyMasterclass.Section05ExpressionsStatements;

/**
 * Create two methods with the same name: convertToCentimeters
 *  . The first method has one parameter of type int, which represents the entire height in inches.
 *    You'll convert inches to centimeters, and pass back the number of centimeters, as a double.
 *  . The second method has two parameters of type int, one to represent height in feet,
 *    and one to represent the remaining height in inches.
 *    So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would be passed to this method.
 *    This method will convert feet and inches to just inches, then call the first method,
 *    to get the number of centimeters, also returning the value as a double.
 * >>>
 * . Both methods should return a real number or decimal value for total height in centimeters.
 * . Call both methods, and print out the results.
 * >>>
 * Formulas: https://www.metric-conversions.org/length/feet-to-centimeters.htm
 *  . 1 inch = 2.54 cm
 *  . 1 foot = 12 inches
 */
public class L52_ChallengeOverloading {

    public static void main (String[] args) {

        System.out.println("My height is 6 feet = " + convertToCentimeters(6, 0) + " centimeters.");
        System.out.println("My height is 5 foot and 8 inches = " + convertToCentimeters(5, 8) + " centimeters.");
        System.out.println("The height of my cat is 50 inches = " + convertToCentimeters(50) + " centimeters.");
    }

    /**
     * Converts inches to centimeters, and returns the number of centimeters as a double.
     * 1 inch = 2.54 cm
     */
    public static double convertToCentimeters(int heightInInches) {

        double totalHeightInCentimeters = heightInInches * 2.54;

        return totalHeightInCentimeters;
    }

    /**
     * Converts feet and inches to centimeters, and returns the number of centimeters as a double.
     * 1 inch = 2.54 cm
     * 1 foot = 12 inches
     */
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {

        int totalHeightInInches = (heightInFeet * 12) + remainingHeightInInches;

        return convertToCentimeters(totalHeightInInches);
    }
}
