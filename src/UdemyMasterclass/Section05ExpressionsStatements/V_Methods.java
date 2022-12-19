package UdemyMasterclass.Section05ExpressionsStatements;

public class V_Methods {

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
}
