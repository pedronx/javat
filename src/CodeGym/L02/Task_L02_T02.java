package CodeGym.L02;

public class Task_L02_T02 {

    /**
     * Feature-length film
     * The centimeters variable contains a number of centimeters.
     * Set the meters variable equal to number of full meters in centimeters (1 m = 100 cm).
     * To perform the calculation, use the centimeters variable and the division operator.
     * Use a single statement to declare and initialize meters.
     */
    static void featureLenght() {
        int centimeters = 243;

        int meters = centimeters / 100;

        System.out.println(meters);
    }

    /**
     * Last digit of a number
     * The number variable contains a number.
     * Set the lastDigit variable equal to the last digit of this number.
     * To perform the calculation, use the number variable and the modulo operator.
     * Use a single statement to declare and initialize lastDigit.
     * Hint: you need the remainder after division by 10.
     */
    static void lastDigit() {
        int number = 546;

        int lastDigit = number % 540;

        System.out.println(lastDigit);
    }

    /**
     * 9 is an inverted 6
     * Using only the increment operator, change the value of the six variable so that the number 9 is displayed.     *
     */
    static void invertedSix() {
        int six = 6;
        six++;
        six++;
        six++;

        System.out.println(six);
    }


    /**
     * Once there were 32 teeth
     * Using only the decrement operator, change the value of the toothCounter variable so that number 23 is displayed.
     */
    static void thirtyTwoTheeth() {
        int toothCounter = 32;

        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;
        toothCounter--;

        System.out.println(toothCounter);
    }

    public static void main (String[] args) {
        featureLenght();
        lastDigit();
        invertedSix();
        thirtyTwoTheeth();
    }
}
