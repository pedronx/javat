package CodeGym.Level09.L02_RandomNumbers;

/**
 * Magic 8 ball
 * In this task, you need to implement a getPrediction() method in the MagicBall class that works like a magic 8 ball.
 * It returns a randomly chosen response to a question. In the getPrediction() method, you need to use the Random class's nextInt(int) method, which should return values from 0 to 7 inclusive.
 * Depending on the value returned by nextInt(int), it returns one of these possible responses:
 * 0 -> Certainly
 * 1 -> Definitely
 * 2 -> Most likely
 * 3 -> The outlook is good
 * 4 -> Ask later
 * 5 -> Try again
 * 6 -> My answer is no
 * 7 -> Very doubtful
 * Otherwise return null.
 * Requirements:
 *   . Implement the getPrediction() method in accordance with the task conditions.
 */
public class MagicBall_Main {

    public static void main (String[] args) {

        // Lesson 02 | Task 02
        System.out.println("Will I make enough money to buy a BMW?");
        System.out.println(MagicBall.getPrediction());
    }
}
