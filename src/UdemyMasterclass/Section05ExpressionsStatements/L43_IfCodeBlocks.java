package UdemyMasterclass.Section05ExpressionsStatements;

public class L43_IfCodeBlocks {

    public static void main (String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        // 1st block
        /*
        if (score == 5000) {
            System.out.println("Your score is 5000");
        } */

        // 2nd block
        /*
        if (score < 5000) {
            System.out.println("Your score is less than 5000");
        } else {
            System.out.println("Got here!");
        }*/

        // 3rd block
        /*
        if (score <= 5000) {
            System.out.println("Your score is less than or equal to 5000");
        } else {
            System.out.println("Got here!");
        } */

        // 4th block
        if (score == 5000) {
            System.out.println("Your score is 5000");
        } else if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000 but greater than 1000");
        } else {
            System.out.println("Got here!");
        }
    }
}
