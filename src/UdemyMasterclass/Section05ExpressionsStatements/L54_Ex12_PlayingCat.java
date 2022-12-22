package UdemyMasterclass.Section05ExpressionsStatements;

/**
 * The cats spend most of the day playing.
 * In particular, they play if the temperature is between 25 and 35 (inclusive).
 * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 * >>>
 * Write a method isCatPlaying that has 2 parameters.
 * Method needs tn true if the cat is playing, otherwise return false
 *    . 1st parameter should be of type boolean and be named summer it represents if it is summer.
 *    . 2nd parameter represents the temperature and is of type int with the name temperature.
 * >>>
 * EXAMPLES OF INPUT/OUTPUT:
 *    . isCatPlaying(true, 10); should return false since temperature is not in range 25 - 45
 *    . isCatPlaying(false, 36); should return false since temperature is not in range 25 - 35 (summer parameter is false)
 *    . isCatPlaying(false, 35); should return true since temperature is in range 25 - 35
 */
public class L54_Ex12_PlayingCat {

    public static void main(String[] args) {
        System.out.println("isCatPlaying(true, 10) : " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36) : " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) : " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying(false, 25) : " + isCatPlaying(false, 25));
        System.out.println("isCatPlaying(false, 24) : " + isCatPlaying(false, 24));
        System.out.println("isCatPlaying(true, 46) : " + isCatPlaying(true, 45));
        System.out.println("isCatPlaying(true, 46) : " + isCatPlaying(true, 46));
    }

    /**
     * Method returns true if the cat is playing, otherwise return false
     * Is plays if the temperature is between 25 and 35 (inclusive).
     * Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }
        } else if (temperature >= 25 && temperature <= 35) {
            return true;
        }

        return false;
    }
}
