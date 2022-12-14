package UdemyMasterclass.S04Basics;

/**
 * Section 01 - IntelliJ Basics
 * 36. Logical OR Operator
 */
public class V_FifthClass {

    public static void main(String[] args) {

        int topScore = 99;
        if (topScore == 100){
            System.out.println("You got the highest score!");
        } else{
            System.out.println("Your score is " + topScore + ".");
        }

        // Prints an extra blank paragraph v1
        System.out.print("\n");

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100.");
        }

        // Prints an extra blank paragraph v2
        System.out.println();

        if ((topScore > 90 || (secondTopScore <=90))){
            System.out.println("Either or both of the conditions are true");
        }
    }
}
