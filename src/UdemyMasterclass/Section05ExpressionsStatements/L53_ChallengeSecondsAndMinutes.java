package UdemyMasterclass.Section05ExpressionsStatements;

/**
 * Create two methods with the same name: getDurationString
 *  . The first method has one parameter of type int, named seconds.
 *  . The second method has two parameters of type int, named minutes and seconds.
 *  >>>
 *  Both methods return a string in the format: "XXh YYm ZZs"
 *   . XX represents number of hours
 *   . YY represents number of minutes
 *   . ZZ represents number of seconds
 * >>>
 * The first method should call the second method to return its results.
 * >>>
 * Add validation to the methods:
 *   . For the first method, the seconds parameter should be >= 0
 *   . For the second method, the minutes parameter should be >= 0,
 *     the seconds parameter should be >= 0 and <= 59
 *   . If either method is passed an invalid value, print out an informative message
 * >>>
 * Conversion formulas
 * 1 h = 60 m = 3600 s
 * 1 m = 60 s
 */
public class L53_ChallengeSecondsAndMinutes {

    public static void main (String[]stringsargs) {

        // Validation: invalid numbers
        System.out.println(getDurationString(-2600));
        System.out.println(getDurationString(-2600, -125896));
        System.out.println(getDurationString(57896));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(856, 8565));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(856, 60));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(0, 0));

        // Convert some durations
        System.out.println(getDurationString(20));
        System.out.println(getDurationString(0, 20));
        System.out.println(getDurationString(1, 59));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(123, 45));
        System.out.println(getDurationString(65, 45));

    }

    /**
     * Receives one parameter of type int: seconds
     * and returns a String in the format: "XXh YYm ZZs"
     * 1 h = 60 m = 3600 s
     * 1 m = 60 s
     */
    public static String getDurationString(int seconds) {

        String time;
        int hours, minutes, mySeconds;

        // validation for invalid times
        if (seconds < 0) {
            System.out.print("Invalid time, please insert again -> ");
            time = "00h 00m 00s";
        } else {
            // conversion for hours
            hours = seconds / 3600;

            // conversion for minutes
            minutes = (seconds - (hours * 3600)) / 60;

            // conversion for seconds
            mySeconds = seconds - (hours * 3600) - (minutes * 60);

            // formating of the string to return
            time = (hours + "h " + minutes + "m " + mySeconds + "s");
        }

        return time;
    }

    /**
     * Receives two parameters of type int: minutes and seconds
     * and returns a String in the format: "XXh YYm ZZs"
     * 1 h = 60 m = 3600 s
     * 1 m = 60 s
     */
    public static String getDurationString(int minutes, int seconds) {

        String time;

        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            time = getDurationString(-1);
        } else {
            time = getDurationString(((minutes * 60) + seconds));
        }

        return time;
    }

}
