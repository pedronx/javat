package CodeGym.Level14.L06_ENum;

/**
 * Four seasons
 * You need to create a set of values (an enum) for the seasons. To do this, create a Season enum in a separate file and declare 4 fields in it.
 * In the Solution method, display each enum value on a new line.
 * Requirements:
 *   . Create a public Season enum in a separate file and add the following values: WINTER, SPRING, SUMMER, AUTUMN.
 *   . In the Solution class, display each season on a new line. Use the enum values directly, e.g. Season.WINTER.
 */
public class MainFourSeasons {

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }
}
