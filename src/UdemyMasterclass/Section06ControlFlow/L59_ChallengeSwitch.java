package UdemyMasterclass.Section06ControlFlow;

/**
 * Returns the name of the day of the week, based on the parameter received
 * 0 -> Sunday / 1 -> Monday / 2 -> Tuesday / 3 -> Wednesday
 * 4 -> Thursday / 5 -> Friday / 6 -> Saturday
 * Any number not between 0 and 6 returns message "Invalid Day".
 * >>>
 * Us the enhanced switch statement as an expression, returning the result
 * to a String named dayOfTheWeek.
 * Print both the day variable and the dayOfTheWeek variable.
 * >>>
 * Bonus: Create a second method called printWeekDay, that uses an if then else
 * statement, instead of a switch, to produce the same output.
 */
public class L59_ChallengeSwitch {

    public static void main (String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-1);

        System.out.println("\n");
        dayOfTheWeek(0);
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(4);
        dayOfTheWeek(5);
        dayOfTheWeek(6);
        dayOfTheWeek(7);
        dayOfTheWeek(-1);
    }

    /**
     * Switch
     * Returns the name of the day of the week, based on the parameter received
     * 0 -> Sunday / 1 -> Monday / 2 -> Tuesday / 3 -> Wednesday
     * 4 -> Thursday / 5 -> Friday / 6 -> Saturday
     * Any number not between 0 and 6 returns message "Invalid Day".
     */
    public static void printDayOfTheWeek(int day) {

        String dayOfTheWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };

        System.out.println(day + " = " + dayOfTheWeek + ".");
    }

    /**
     * If-Then-Else
     * Returns the name of the day of the week, based on the parameter received
     * 0 -> Sunday / 1 -> Monday / 2 -> Tuesday / 3 -> Wednesday
     * 4 -> Thursday / 5 -> Friday / 6 -> Saturday
     * Any number not between 0 and 6 returns message "Invalid Day".
     */
    public static void dayOfTheWeek(int day) {

        String dayOfTheWeek = "Invalid Day";

        if (day >=0 && day <= 6) {
            if (day == 0) {
                dayOfTheWeek = "Sunday";
            } else if (day == 1) {
                dayOfTheWeek = "Monday";
            } else if (day == 2) {
                dayOfTheWeek = "Tuesday";
            } else if (day == 3) {
                dayOfTheWeek = "Wednesady";
            } else if (day == 4) {
                dayOfTheWeek = "Thursday";
            } else if (day == 5) {
                dayOfTheWeek = "Friday";
            } else if (day == 6) {
                dayOfTheWeek = "Saturday";
            }
        }

        System.out.println(day + " = " + dayOfTheWeek + ".");
    }
}
