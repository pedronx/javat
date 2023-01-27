package CodeGym.Level10.L05_StringsInJava;

import java.util.Scanner;

/**
 * 1. Search for Strings
 * boolean equals(String str)               Strings are considered equal if all of their characters match.
 * boolean equalsIgnoreCase(String str)     Compares strings, ignoring the case of letters (ignores whether they are uppercase or lowercase)
 * int compareTo(String str)                Compares strings lexicographically. Returns 0 if the strings are equal.
 *                                          The return value is less than zero if the current string is less than the string parameter.
 *                                          The return value is greater than if the current string is greater than the string parameter.
 * int compareToIgnoreCase(String str)      Compares strings lexicographically while ignoring case. Returns 0 if the strings are equal. The return value is negative if the current string is less than the string parameter. The return value is greater than if the current string is greater than the string parameter.
 * boolean regionMatches(int toffset,       Compares parts of strings
 *                      String str, int offset, int len)
 * boolean startsWith(String prefix)        Checks whether the current string starts with the string prefix
 * boolean endsWith(String suffix)          Checks whether the current string ends with the string suffix
 * ------------------------------------------
 * 2. Search for SubStrings
 * int indexOf(String str)				    Searches for the string str in the current string. Returns the index of the first character of the first occurrence.
 * int indexOf(String str, int index)	    Searches for the string str in the current string, skipping the first index characters. Returns the index of the occurrence.
 * int lastIndexOf(String str)			    Searches for the string str in the current string, starting from the end. Returns the index of the first occurrence.
 * int lastIndexOf(String str, int index)	Searches for the string str in the current string from the end, skipping the first index characters.
 * boolean matches(String regex)		    Checks whether the current string matches a pattern specified by a regular expression.
 * ------------------------------------------
 * 3. Create substrings
 * String substring(int beginIndex, int endIndex)	Returns the substring specified by the index range beginIndex..endIndex.
 * String repeat(int count)						    Repeats the current string n times
 * String replace(char oldChar, char newChar)	    Returns a new string: replaces the character oldChar with the character newChar
 * String replaceFirst(String regex, String replacement)	Replaces the first substring, specified by a regular expression, in the current string.
 * String replaceAll(String regex, String replacement)		Replaces all substrings in the current string that match the regular expression.
 * String toLowerCase()							    Converts the string to lowercase
 * String toUpperCase()							    Converts the string to uppercase
 * String trim()								    Removes all spaces at the beginning and end of a string
 */
public class Main {

    public static void main(String[] args) {

        // Lesson 05 | Example 01
//        checkFile();
//        System.out.println();

        // Lesson 05 | Task 01
//        urlValidation();
//        System.out.println();

        // Lesson 05 // Example 02
//        replaceDomain();
//        System.out.println();

        // Lesson 05 | Task 02
        String string = "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire.";
        String word = "code";
        int indexOfFirstWord = getIndexOfFirstWord(string, word);
        int indexOfLastWord = getIndexOfLastWord(string, word);
        System.out.println(string + "\n");
        System.out.println("The index of the first character of the first instance of the word \"" + word + "\" is " + indexOfFirstWord);
        System.out.println("The index of the first character of the last instance of the word \"" + word + "\" is " + indexOfLastWord);
        System.out.println();

        // substring()
        System.out.println("\"Hellos\".substring(0, 3)" + "\tHellos".substring(0, 3));
        System.out.println("\"Hellos\".substring(1, 4)" + "\t\tHellos".substring(1, 4));
        System.out.println("\"Hellos\".substring(1, 6)" + "\t\tHellos".substring(1, 6));
        System.out.println("\"Hellos\".substring(1)" + "\t\t\tHellos".substring(1));
        System.out.println();

        // repeat()
        System.out.println("\"Hello\".repeat(3)" + "\t\t" + "Hello".repeat(3));
        System.out.println("\"Hello\".repeat(2)" + "\t\t" + "Hello".repeat(2));
        System.out.println("\"Hello\".repeat(1)" + "\t\t" + "Hello".repeat(1));
        System.out.println("\"Hello\".repeat(0)" + "\t\t" + "Hello".repeat(0));
        System.out.println();

        // replace()
        System.out.println("\"Programming\".replace('Z', 'z')" + "\t\tProgramming".replace('Z', 'z'));
        System.out.println("\"Programming\".replace('g', 'd')" + "\t\tProgramming".replace('g', 'd'));
        System.out.println("\"Programming\".replace('a', 'e')" + "\t\tProgramming".replace('a', 'e'));
        System.out.println("\"Programming\".replace('m', 'w')" + "\t\tProgramming".replace('m', 'w'));
        System.out.println();

        // replaceFirst() and replaceAll()
        System.out.println("\"Good news everyone!\".replaceAll(\"e.\", \"EX\")" + "\t\tGood news everyone!".replaceAll("e.", "EX"));
        System.out.println("\"Good news everyone!\".replaceAll(\"o.\", \"-o-\")" + "\t\tGood news everyone!".replaceAll("o.", "-o-"));
        System.out.println("\"Good news everyone!\".replaceFirst(\"e.\", \"EX\")" + "\t\tGood news everyone!".replaceFirst("e.", "EX"));
        System.out.println("\"Good news everyone!\".replaceFirst(\"o.\", \"-o-\")" + "\t\tGood news everyone!".replaceFirst("o.", "-o-"));
        System.out.println();

        // Lesson 05 | Task 03
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
}

    /**
     * Asks the user for a path to a file
     * Checks the file type based on its extension
     */
    public static void checkFile() {

        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        if (path.endsWith(".jpg") || path.endsWith(".jpeg")) {
            System.out.println("This is a jpeg!");
        } else if (path.endsWith(".htm") || path.endsWith(".html")) {
            System.out.println("This is an HTML page");
        } else if (path.endsWith(".doc") || path.endsWith(".docx")) {
            System.out.println("This is a Word document");
        } else if (path.endsWith(".mp3") || path.endsWith(".mp4")) {
        System.out.println("This is a Music file");
        } else if (path.endsWith(".avi") || path.endsWith(".mkv")) {
            System.out.println("This is a Movie file");
        } else {
            System.out.println("Unknown format");
        }
    }

    /**
     * URL validation
     * In this task, you need to perform URL validation.
     * A simple URL scheme looks like this:
     * <network protocol>://<resource name>.<domain>
     * The checkProtocol(String) method checks the network protocol (http or https) of the URL passed in input parameter and returns the result of this check — the name of the network protocol as a string.
     * And the checkDomainExtension(String) method checks the domain (com, net, org, or us) of the URL passed in the input parameter, and returns the result of the check — the domain extension as a string.
     * If the URL does not start with http or https, then the result will be "unknown".
     * If the URL does not end with com, net, org, or us, the result is "unknown".
     */
    public static void urlValidation() {

        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {

        if (url.startsWith("http:")) {
            return "http";
        } else if  (url.startsWith("https")) {
            return "https";
        } else {
            return "unknown";
        }
    }

    public static String checkDomainExtension(String url) {

        if (url.endsWith(".com")) {
            return "com";
        } else if (url.endsWith(".net")){
            return "net";
        } else if (url.endsWith(".org")){
            return "org";
        } else if (url.endsWith(".us")){
            return "us";
        } else {
            return "unknown";
        }
    }

    /**
     * Replace the domain name with "codegym.cc"
     *      The domain name is preceded by two forward slashes — "//"
     * The domain name is followed by a single forward slash — "/"
     */
    public static void replaceDomain() {
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();

        int index = path.indexOf("//");
        int index2 = path.indexOf("/", index + 2);

        String first = path.substring(0, index + 2);
        String last = path.substring(index2);

        String result = first + "codegym.cc" + last;
        System.out.println(result);
    }

    /**
     * Searching in a string
     * The getIndexOfFirstWord(String, String) method and the getIndexOfLastWord(String, String) method both accept a string and a word.
     * The getIndexOfFirstWord(String, String) method needs to return the index of the first character
     * of the first instance of the word (the second method parameter) in the string (the first method parameter).
     * And the getIndexOfLastWord(String, String) method needs to return the index of the first character
     * of the last instance of the word (the second method parameter) in the string (the first method parameter).
     * Example:
     *   The string is "To become a programmer, you need to write code. To write code, you have to learn. To learn, you need desire."
     *   The word is "code".
     *      getIndexOfFirstWord(string, word) method must return 42
     *      getIndexOfLastWord(string, word) method must return 57
     * The main() method is not involved in testing.
     * Requirements:
     *   . You need to display the index of the first character of the first instance of the word (the second method parameter) in the string (the first method parameter).
     *   . You need to display the index of the first character of the last instance of the word (the second method parameter) in the string (the first method parameter).
     */
    public static int getIndexOfFirstWord(String string, String word) {

        int firstIndex = string.indexOf(word);
        return firstIndex;
    }

    public static int getIndexOfLastWord(String string, String word) {
        int lastIndex = string.lastIndexOf(word);
        return lastIndex;
    }

    /**
     * Path update
     * Implement the changePath(String, String) method so that it replaces the jdk version in the path passed in the first method parameter with the version passed in the second parameter, and returns the new path.
     * The JDK version starts with "jdk" and ends at "/".
     * Example:
     * path - "/usr/java/jdk1.8/bin"
     * JDK version - "jdk-13"
     * The changePath(path, JDK version) method should return the path "/usr/java/jdk-13/bin".
     * The main() method is not involved in testing.
     * Requirements:
     *   . The changePath(String, String) method needs to be implemented as outlined in the task conditions.
     */
    public static String changePath(String path, String jdk) {

        int lastIndex = path.lastIndexOf("/");
        int pathIndex = path.lastIndexOf("/", lastIndex -1);

        String first = path.substring(0, pathIndex + 1);
        String last = path.substring(lastIndex);

        return first + jdk + last;

        /* Alternative
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
         */
    }
}
