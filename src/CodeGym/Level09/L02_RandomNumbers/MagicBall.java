package CodeGym.Level09.L02_RandomNumbers;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Certainly";
    private static final String DEFINITELY = "Definitely";
    private static final String MOST_LIKELY = "Most likely";
    private static final String OUTLOOK_GOOD = "The outlook is good";
    private static final String ASK_AGAIN_LATER = "Ask later";
    private static final String TRY_AGAIN = "Try again";
    private static final String NO = "My answer is no";
    private static final String VERY_DOUBTFUL = "Very doubtful";

    public static String getPrediction() {

        int n = 0;
        Random r = new Random();

        n = r.nextInt(8); // return int between zero (inclusive) and 8 (exclusive)

        switch (n) {
            case 0:
                return CERTAIN;
            case 1:
                return DEFINITELY;
            case 2:
                return MOST_LIKELY;
            case 3:
                    return OUTLOOK_GOOD;
            case 4:
                    return ASK_AGAIN_LATER;
            case 5:
                    return TRY_AGAIN;
            case 6:
                    return NO;
            case 7:
                    return VERY_DOUBTFUL;
            default:
                return null;
        }
    }
}