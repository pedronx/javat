package UdemyMasterclass.Section05ExpressionsStatements;

public class L51_MethodOverloading {

    public static void main (String[] args) {

        int newScore = calculateScore("Pedro", 200);
        System.out.println("New score is " + newScore + " points.");

        // call 2nd Overloaded method
        calculateScore(75);

        // call 3rd Overloaded method
        calculateScore();
    }

    // 1st method to Overload
    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // 2nd method to Overload
    public static int calculateScore(int score) {

        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    // 3rd method to Overload
    public static int calculateScore() {

        System.out.println("No player name, no player score.");
        return 0;
    }
}
