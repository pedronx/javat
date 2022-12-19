package UdemyMasterclass.Section04Basics;

/**
 * Section 01 - IntelliJ Basics
 * 35. Logical AND Operator
 */
public class IV_FourthClass {

    public static void main(String[] args) {

        int topScore = 99;
        if (topScore == 100){
            System.out.println("You got the highest score!");
        } else{
            System.out.println("Your score is " + topScore + ".");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("\n Greater than second top score and less than 100.");
        }
    }
}
