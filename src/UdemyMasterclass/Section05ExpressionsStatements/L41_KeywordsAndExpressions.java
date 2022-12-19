package UdemyMasterclass.Section05ExpressionsStatements;

public class L41_KeywordsAndExpressions {

    public static void main (String[] args) {
        // 1 mile = 1.609344 km
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore;   // add bonus points
        }

        int health = 100;
        if ((health > 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
    }
}
