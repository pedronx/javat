package CodeGym.Level10.L04_StringClass;

import java.util.Scanner;

/**
 * Methods of the String class
 * int length()                     Returns the number of characters in the string
 * boolean isEmpty()				Checks whether the string is an empty string
 * boolean isBlank()				Checks that the string contains only whitespace characters: space, tab, new line, etc.
 * char charAt(int index)			Returns the character at the index position in the string.
 * char[] toCharArray()			    Returns an array of the characters (a copy) that make up the string
 * byte[] getBytes()				Converts a string to a set of bytes and returns the array of bytes.
 * String[] split(String regex)	    Splits a string into multiple substrings.
 * String join(CharSequence delimiter, elements)		Joins multiple substrings together
 * String intern()					Puts a string into the string pool.
 */
public class Main {

    public static void main (String[] args) {

        // Lesson 4 | examples
        charConversionV1();
        System.out.println();
        charConversionV2();
        System.out.println();
        charConversionV3();
        System.out.println();
    }

    /**
     * Converts a file path from Unix style to Windows style.
     * Unix uses the / character to separate folders, while Windows uses the \ character.
     * Solution 1: using a char array
     */
    public static void charConversionV1() {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        char[] chars = path.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if (chars[i] == '/')
                chars[i] = '\\'; // replace with \, escaped with another \

        String result = new String(chars);
        System.out.println(result);
    }

    /**
     * Converts a file path from Unix style to Windows style.
     * Unix uses the / character to separate folders, while Windows uses the \ character.
     * Solution 2: using the split() and join() methods
     */
    public static void charConversionV2() {

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String[] array = path.split("/"); // Convert string to an array of strings.

        String result = String.join("\\", array); // Concatenate all the strings in the array of strings.
                                                          // The \ is used as a separator (we see it escaped).
        System.out.println(result);
    }

    /**
     * Converts a file path from Unix style to Windows style.
     * Unix uses the / character to separate folders, while Windows uses the \ character.
     * Solution 3: using the replace(char oldChar, char newChar) method
     */
    public static void charConversionV3() {

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        String result = path.replace('/', '\\'); // replace one character with another; the second is escaped

        System.out.println(result);
    }

}
