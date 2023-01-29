package CodeGym.Level13.L02_Wrappers;

/**
 * Analyzing strings
 * Implement the countDigits(String), countLetters(String), and countSpaces(String) methods, which should return the number of digits, letters, and spaces, respectively, in a string.
 * The main() method is not involved in testing.
 * Requirements:
 *   . The countDigits(String) method should return the number of digits in the passed string.
 *   . The countLetters(String) method should return the number of letters in the passed string.
 *   . The countSpaces(String) method should return the number of spaces in the passed string.
 */
public class MainAnalyzingString {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. 23" +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLetters(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int countSpaces(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}
