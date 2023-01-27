package CodeGym.Level10.L03_EscapingCharacters;

/**
 * Escaping characters
 * char c = '\"';       \" is one character, not two
 * char c = '"';        Double quotation mark inside single quotes
 * \n       Line break character
 * \t 	    Insert a tab character
 * \b 	    Insert a backspace character
 * \n 	    Insert a newline character
 * \r 	    Insert a carriage return character
 * \f 	    Insert a page feed character
 * \' 	    Insert a single quotation mark
 * \" 	    Insert a double quotation mark
 * \\ 	    Insert a backslash
 */
public class Main {

    /*--- Lesson 03 | Task 03 ---*/
    public static String partyFace = "\uD83E\uDD73";
    public static String balloon = "\uD83C\uDF88";
    public static String gift =  "\uD83C\uDF81";
    public static String partyPopper = "\uD83C\uDF89";
    public static String cake =  "\uD83C\uDF82";

    public static void main (String[] args) {

        // Backslash
        System.out.println("\"Friends\" was nominated for an \"Oscar\"");
        System.out.println("c:\\projects\\my\\first");
        System.out.println();

        // Line break
        System.out.println("Best regards,\nAnonymous");
        System.out.println();

        // Tab
        System.out.println("Tab");
        System.out.println("0\t1\t2\t3");
        System.out.println("0\t10\t20\t30");
        System.out.println("0\t100\t200\t300");
        System.out.println();

        // Lesson 03 | Task 01
        escape();
        System.out.println();

        // Escape character
        System.out.println("\u00A9 CodeGym");
        System.out.println();

        // Lesson 03 | Task 02
        unicode();
        System.out.println();

        // Emojis
        System.out.println("\uD83D\uDD0A");
        System.out.println();

        // Lesson 03 | Task 03
        congratulations();
    }

    /**
     * Escaping characters
     * Display the following text on two lines:
     * It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
     * It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
     * Hint: \" is for escaping a double quotation mark;
     * \\ is for escaping a backslash (\).
     */
    public static void escape() {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }

    /**
     * Unicode encoding
     * The public static init(char[]) method is passed an array of 9 characters, which needs to be filled with the following values:
     *     0 - '\u00A9'
     *     1 - '\u004A'
     *     2 - '\u0061'
     *     3 - '\u0076'
     *     4 - '\u0061'
     *     5 - '\u0052'
     *     6 - '\u0075'
     *     7 - '\u0073'
     *     8 - '\u0068'
     * To see the result, run the main() method.
     * Requirements:
     *   . The init(char[]) method needs to fill the received char array in accordance with the task conditions.
     */
    public static void unicode() {

        char[] symbols = new char[9];
        init(symbols);
        System.out.println(new String(symbols));

    }

    public static void init(char[] symbols) {

        symbols[0] = '\u00A9';
        symbols[1] = '\u004A';
        symbols[2] = '\u0061';
        symbols[3] = '\u0076';
        symbols[4] = '\u0061';
        symbols[5] = '\u0052';
        symbols[6] = '\u0075';
        symbols[7] = '\u0073';
        symbols[8] = '\u0068';
    }

    /**
     * Congratulations
     * Initialize the static variables with the following values:
     *     partyFace - "\uD83E\uDD73"
     *     balloon - "\uD83C\uDF88"
     *     gift - "\uD83C\uDF81"
     *     partyPopper - "\uD83C\uDF89"
     *     cake - "\uD83C\uDF82"
     * To see some congratulations, run the main() method.
     * Requirements:
     *   . The partyFace variable must be initialized with the value "\uD83E\uDD73" when it is declared.
     *   . The balloon variable must be initialized with the value "\uD83C\uDF88" when it is declared.
     *   . The gift variable must be initialized with the value "\uD83C\uDF81" when it is declared.
     *   . The partyPopper variable must be initialized with the value "\uD83C\uDF89" when it is declared.
     *   . The cake variable must be initialized with the value "\uD83C\uDF82" when it is declared.
     */
    public static void congratulations() {

        String happyBirthday = "Happy birthday!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);
    }
}
