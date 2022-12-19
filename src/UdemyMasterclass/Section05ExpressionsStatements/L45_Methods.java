package UdemyMasterclass.Section05ExpressionsStatements;

public class L45_Methods {

    public static void main (String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, 10000, 8, 200);

        // 2nd part of the Methods lesson, with Return values
        score = 800;
        levelCompleted = 5;
        bonus = 100;
        int highScore;

        // Calculate and display the Final score - Pt. 1
        highScore = calculateAndReturnScore(gameOver, score, levelCompleted, bonus);
        System.out.println("\nYour final score is " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateAndReturnScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

    }


    /**
     * Calculate the final Score of a game
     */
    public static void calculateScore(boolean myGameOver, int myScore, int myLevelCompleted, int myBonus) {
        int finalScore = myScore;

        if (myGameOver) {
            finalScore += (myLevelCompleted * myBonus);
            System.out.println("Your final score is " + finalScore);
        }
    }

    /**
     * Calculate and return the final Score of a game
     */
    public static int calculateAndReturnScore(boolean myGameOver, int myScore, int myLevelCompleted, int myBonus) {
        int finalScore = myScore;

        if (myGameOver) {
            finalScore += (myLevelCompleted * myBonus);
        }

        return finalScore;
    }
}
