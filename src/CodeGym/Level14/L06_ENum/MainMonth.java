package CodeGym.Level14.L06_ENum;

/**
 * Next month, please
 * In the Solution class, implement the getNextMonth method, which should return the next month. If the last month of the year is passed, return the first. Use the values and ordinal methods.
 * The main method is not checked.
 * Requirements:
 *   . Implement a public static Month getNextMonth(Month) metho that works in accordance with the task conditions.
 *   . The getNextMonth method should use the ordinal() and values() methods.
 */
public class MainMonth {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));

        System.out.println("\n" + Month.getWinterMonths());
    }

    public static Month getNextMonth(Month month) {

        if (month.ordinal() == 11) {
            return Month.JANUARY;
        } else {
            int ordinal = month.ordinal();
            return Month.values()[(ordinal + 1)];
        }
    }
}
