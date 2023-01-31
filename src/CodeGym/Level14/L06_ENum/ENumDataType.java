package CodeGym.Level14.L06_ENum;

/**
 * Declaring a new enum data type looks like this:
 *      enum TypeName
 *      {
 *          VALUE1,
 *          VALUE2,
 *          VALUE3
 *      }
 *
 */
public class ENumDataType {

    public static void main(String[] args) {

        // create a DayOfTheWeek enum
        enum Day
        {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        Day aDay = Day.MONDAY;
        System.out.println(aDay);

        System.out.println("-".repeat(15));

        // Methods of an enum
        Day[] days = Day.values();

        for (Day day: days)
            System.out.println(day);

        System.out.println("\n" + days[2]);

        System.out.println("-".repeat(15));
        System.out.println("Day.MONDAY.ordinal(): " + Day.MONDAY.ordinal());
        System.out.println("Day.FRIDAY.ordinal(): " + Day.FRIDAY.ordinal());
        System.out.println("Day.SUNDAY.ordinal(): " + Day.SUNDAY.ordinal());
    }
}
