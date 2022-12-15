package CodeGym.L02;

// Level 2 | Lesson 6

public class Task_L02_T03 {

    /**
     * The logo is everything
     * Set the tagline variable equal to the string "JustDoIt". Use s1, s2, and s3, and string concatenation.
     */
    static void theLogo() {
        String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2;

        System.out.println(tagline);
    }

    /**
     * Emptiness and spaces
     * Fill space with emptiness... or vice versa.
     * Use emptiness, strings consisting of single spaces, and string concatenation to set the fullness variable to the string "emptiness emptiness emptiness".
     */
    static void emptinessAndSpaces() {
        String emptiness = "emptiness";

        String fullness = emptiness + " " + emptiness + " " + emptiness;

        System.out.println(fullness);
    }

    /**
     * Concatenation of strings and numbers
     * Set the digits variable equal to the string "60".
     * Use the x, y, and z variables, an empty string, and string concatenation.
     */
    static void concatenationOfStrings() {
        int x = 2;
        int y = 4;
        int z = 0;

        String digits = "" + (x + y) + z;

        System.out.println(digits);
    }

    /**
     * Bigger every time
     * Set the hugeAmount variable equal to the number 100500.
     * Use the bigAmount and greatAmount variables as well as string-to-number conversion.
     * Use a single statement to declare and initialize hugeAmount.
     */
    static void biggerEveryTime() {
        String bigAmount = "500";
        String greatAmount = "100000";

        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);

        System.out.println(hugeAmount);
    }

    /**
     * Getting the length of a string
     * The main method displays the values of three strings.
     * Modify the code so that it displays the length each string instead of the value of each string.
     */
    static void lenghtOfString() {
        String emptyString = "";

        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
    }

    /**
     * Sprucing up your resume
     * The main method displays four lines.
     * Each of them are superb examples of abuse of capital letters.
     * Modify the code so that all the letters in these strings are lowercase.
     */
    static void sprucingUpResume() {
        String title = "Senior Lead Principal Software Engineer Data Architect";
        String degree = "In college, I Majored in Political Science and Minored in Religious Studies.";
        String career = "Experienced Team Leader with strong Organizational Skills and a Successful career in Management.";

        System.out.println("RESUME".toLowerCase());
        System.out.println(("TITLE: " + title).toLowerCase());
        System.out.println(("DEGREE: " + degree).toLowerCase());
        System.out.println(("CAREER: " + career).toLowerCase());
    }

    /**
     * Don't you raise your voice at me!
     * The main method displays three strings.
     * Modify the code so that all the letters in these strings are capitalized.
     */
    static void raiseYourVoice() {
        String caps = "if I type in uppercase, ";
        String usa = "usa";

        //write your code here
        System.out.println(usa.toUpperCase());
        System.out.println("Winnie the Pooh".toUpperCase());
        System.out.println((caps + "they know I mean business").toUpperCase());
    }

    public static void main (String[] args) {
        theLogo();
        emptinessAndSpaces();
        concatenationOfStrings();
        biggerEveryTime();
        lenghtOfString();
        sprucingUpResume();
        raiseYourVoice();
    }
}
