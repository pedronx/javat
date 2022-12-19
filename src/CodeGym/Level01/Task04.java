package CodeGym.Level01;

public class Task04 {

    /**
     * It's currently 3126. My friend was born 8 years ago.
     * Write a program that displays my friend's birth year.
     */
    static void myYoungFriend() {
        int currentYear = 3126;

        System.out.println("My fiend's birth year is " + (currentYear - 8));
    }

    /**
     * Write a program that declares the following variables in the main method:
     * String name, int age, and String city.
     *
     * Note: "Declaring a variable" is the same thing as "creating a variable".
     */
    static void declareVariables() {
        String name = "Pedro";
        int age = 42;
        String city = "Almada";
    }

    public static void main(String[] args) {
        myYoungFriend();
        declareVariables();
    }
}
