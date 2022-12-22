package UdemyMasterclass.Section06ControlFlow;

/**
 * Number In Word
 * Write a method called printNumberInWord.
 * The method has one parameter number which is the whole number.
 * The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
 * if the int parameter number is 0, 1, 2, .... 9 or other, for any other number including negative numbers.
 * You can use if-else statement or switch statement whatever is easier for you.
 * >>>
 * NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
 * NOTE: Do not add main method to solution code.
 */
public class L59_Ex13_NumberInWord {

    public static void main (String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(3);
        printNumberInWord(9);
        printNumberInWord(-1);
        printNumberInWord(10);
    }

    /**
     * The method one parameter number and prints "ZERO", "ONE", "TWO", ... "NINE", "OTHER"
     *  if the int parameter number is 0, 1, 2, .... 9 or other, for any other number including negative numbers.
     */
    public static void printNumberInWord(int number) {

        String numberInWord = "OTHER";

        switch (number) {
            case 0: numberInWord = "ZERO";
                break;
            case 1: numberInWord = "ONE";
                break;
            case 2: numberInWord = "TWO";
                break;
            case 3: numberInWord = "THREE";
                break;
            case 4: numberInWord = "FOUR";
                break;
            case 5: numberInWord = "FIVE";
                break;
            case 6: numberInWord = "SIX";
                break;
            case 7: numberInWord = "SEVEN";
                break;
            case 8: numberInWord = "EIGHT";
                break;
            case 9: numberInWord = "NINE";
                break;
            default: break;
        }

        System.out.println(numberInWord);
    }
}
