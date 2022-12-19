package UdemyMasterclass.Section05ExpressionsStatements;

public class L48_MethodsChallengeTwo {

    public static void main(String[] args) {
        int highScore;

        highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScore);

        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Percy", calculateHighScorePosition(900));
        displayHighScorePosition("Ana", calculateHighScorePosition(500));
        displayHighScorePosition("Gilbert", calculateHighScorePosition(200));
        displayHighScorePosition("Joana", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
        displayHighScorePosition("Lars", calculateHighScorePosition(-2000));
    }

    /**
     * Display a high-score position
     */
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the high score list");
    }

    /**
     * Calculate a high-score position
     */
    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}
