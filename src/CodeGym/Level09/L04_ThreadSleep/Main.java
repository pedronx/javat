package CodeGym.Level09.L04_ThreadSleep;

import static java.lang.Thread.sleep;
import java.util.concurrent.TimeUnit;

/**
 * Thread.sleep(long);
 * duration is the length of the pause in milliseconds (1/1000 of a second).
 *      Thread.sleep(2000); // Pauses the program for 2 seconds.
 *      Thread.sleep(500); // Pauses the program for half a second.
 *      Thread.sleep(60 * 60 * 1000); // Pauses the program for 1 hour.
 * Variation:
 * Thread.sleep(milliseconds, nanoseconds); // sleep for the specified amount of milliseconds and nanoseconds
 * Thread.sleep(1, 500_000); // pause of one and a half milliseconds
 * Thread.sleep(0, 100_000); // pause of 1/10 of a millisecond
 * ------------------------
 * java.util.concurrent.TimeUnit
 * TimeUnit.HOURS.sleep(15) // sleeps for 15 hours
 * TimeUnit class has the following properties:
 *     nanoseconds: NANOSECONDS
 *     microseconds: MICROSECONDS
 *     milliseconds: MILLISECONDS
 *     seconds SECONDS
 *     minutes: MINUTES
 *     hours: HOURS
 *     days: DAYS
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Lesson 04 | Task 01
//        countDown();

        // Lesson 04 | Task 02
//        printNumbers();

        // Lesson 04 | Task 03
        setTimer(0, 0, 0, 5, 0);
    }

    /**
     * Countdown
     * The countDown() method of the Solution class has a countdown. You need to ensure that there is a 1-second pause between each instance of console output. The Thread class's sleep(long) method will help you do this.
     * Requirements:
     *   . Implement the countDown() method in accordance with the task conditions.
     */
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        sleep(1000);
        System.out.println("2");
        sleep(1000);
        System.out.println("1");
        sleep(1000);
        System.out.println("Start!");
    }

    /**
     * Counter
     * In the Solution class, implement the printNumbers() method, which prints numbers
     * from 1 to 10 inclusive with a 1.3-millisecond pause between each number.
     * The Thread class's sleep(long, int) method will help you do this.
     * Requirements:
     *   . Implement the printNumbers() method in accordance with the task conditions.
     */
    public static void printNumbers() throws InterruptedException {

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
            sleep(1, 300_00);
        }
    }

    /**
     * Timer
     * In the Solution class, implement the setTimer(int, int, int, int, int) method,
     * which sleeps for a specified time using the corresponding methods of the java.util.concurrent.TimeUnit class.
     * Requirements:
     *   . The setTimer(int, int, int, int, int) method must be implemented in accordance with the task conditions.
     */
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("The timer has started!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
