package CodeGym.Level12.L02_StaticVariables;

/**
 * Presentation of robots
 * The main method creates 5 robots and displays information about them.
 * Remove as many static modifiers as possible without changing the functionality of the program.
 * Don't change anything in the main method.
 * Requirements:
 *   . The static modifier should be placed correctly.
 */
public class MainRobot {

    public static void main(String[] args) {
        System.out.println("Presentation of robots manufactured by " + Robot.vendor);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.displayInformation();

        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.displayInformation();
    }
}
