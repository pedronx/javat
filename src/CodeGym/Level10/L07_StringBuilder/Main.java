package CodeGym.Level10.L07_StringBuilder;

/**
 * StringBuilder
 *      StringBuilder name = new StringBuilder(string);
 *      StringBuilder name = new StringBuilder(); // empty mutable string
 * Methods
 * StringBuilder append(obj)                    Converts the passed object to a string and appends it to the current string
 * StringBuilder insert(int index, obj)         Converts the passed object to a string and inserts it into the current string
 * StringBuilder replace(int start, int end, String str)    Replaces the part of the string specified by the start..end interval with the passed string
 * StringBuilder deleteCharAt(int index)        Removes the character with the specified index from the string
 * StringBuilder delete(int start, int end)     Removes characters within the specified interval from the string
 * int indexOf(String str, int index)           Searches for a substring in the current string
 * int lastIndexOf(String str, int index)       Searches for a substring in the current string, starting from the end
 * char charAt(int index)                       Returns the character in the string at the passed index
 * String substring(int start, int end)         Returns the substring defined by the specified interval
 * StringBuilder reverse()                      Reverses the current string.
 * void setCharAt(int index, char)              Changes the character at the specified index to the passed character
 * int length()                                 Returns the length of the string in characters
 */
public class Main {

    public static void main(String[] args) {

        // append()
        StringBuilder builder = new StringBuilder("Hi");
        builder.append("Bye");
        builder.append(123);

        System.out.println(builder);
        System.out.println();

        // toString()
        builder = new StringBuilder("Hi");
        builder.append(123);
        String result = builder.toString();
        System.out.println(result);
        System.out.println();

        // deleteCharAt()
        builder = new StringBuilder("Hello");
        builder.deleteCharAt(2);
        result = builder.toString();
        System.out.println(result);
        System.out.println();

        // replace(int begin, int end, String str)
        builder = new StringBuilder("Mellow");
        builder.replace(2, 5, "Hello!");
        result = builder.toString();
        System.out.println(result);
        System.out.println();

        // Task 01
        String string = "Learn, learn, and learn again! ";

        System.out.println(addTo(string, new String[]{"A", "rolling", "stone", "gathers", "no", "moss"}));
        System.out.println(replace(string, ", ", 16, 27));
        System.out.println();

        // reverse()
        String str = "Hello";
        builder = new StringBuilder(str);
        builder.reverse();
        result = builder.toString();
        System.out.println(result);
        System.out.println();

        // Task 02
        string = "The cat is walking backwards";
        System.out.println(string);
        System.out.println(reverseString(string));

    }

    /**
    Let's work with StringBuilder
    * You need to implement 2 methods using a StringBuilder: addTo(String, String[]) and replace(String, String, int, int).
     *   . The addTo(String, String[]) method adds to the string received as the first parameter, in order,
     *     all the strings in the array of strings received as the second parameter and returns a StringBuilder object based this cumulative string.
     *   . To add a new value to an existing StringBuilder object, you need to call its append(String) method and pass the new value to it.
     *   . The replace(String, String, int, int) method replaces the part of the string received as the first parameter,
     *     starting at the index received as the third parameter and ending with the index received as the fourth parameter,
     *     with the string received as the second parameter, and returns a StringBuilder based on this modified string.
     *   . To replace part of the value of a StringBuilder object, you need to call its replace(int, int, String) method,
     *     passing in the starting and ending replacement indices, as well as the new value.
     * Requirements:
     *   . The addTo(String, String[]) method needs to be implemented as outlined in the task conditions.
     *   . The replace(String, String, int, int) method needs to be implemented as outlined in the task conditions.
     */
    public static StringBuilder addTo(String string, String[] strings) {

        StringBuilder result = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            result.append(strings[i]);
        }
        return result;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {

        StringBuilder result = new StringBuilder(string);
        result.replace(start, end, str);
        return result;
    }

    /**
     * Flipping strings
     * Using a StringBuilder in the reverseString(String) method, reverse the string that is received as a parameter.
     * Requirements:
     *   . The reverseString(String) method needs to use a StringBuilder.
     *   . The reverseString(String) method must return the reversed string.
     */
    public static String reverseString(String string) {

        StringBuilder str = new StringBuilder(string);
        return str.reverse().toString();
    }
}