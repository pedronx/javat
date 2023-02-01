package CodeGym.Level14.L07_Switch;

/**
 * From if to switch
 * The Solution class has a getMonthByIndex(int) method that returns the name of the month by its index, starting with 1. Your task is to rewrite the method using only a switch statement and the case and break keywords.
 * Requirements:
 *   . The getMonthByIndex(int) method should return the name of the month by its index.
 *   . The getMonthByIndex(int) method should only use a switch (multiple-choice) statement.
 */
public class FromIfToSwitch {

    public static void main(String[] args) {
        System.out.println(getMonthByIndex(4));
        System.out.println(getMonthByIndex(8));
        System.out.println(getMonthByIndex(12));
    }

    public static String getMonthByIndex(int monthIndex) {

        String monthString;
        switch (monthIndex) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;
        }
        return monthString;
    }
}