package CodeGym.Level04;

/**
 * Sum of numbers not divisible by 3
 * Display the sum of numbers from 1 to 100 inclusive that are not multiples of 3. Use a while loop to do this.
 * Hint: To move to the next number in the loop, use a continue statement.
 * Requirements:
 *   . The program should display the sum of numbers from 1 to 100 inclusive that are not multiples of 3.
 *   . The program must use a while loop.
 *   . The program must use a continue statement.
 */
public class L04_T02_SumNotDivisibleBy3 {

    public static  void main (String[] args) {

        int i = 1, sum = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                i++;
                continue;
            } else {
                sum += i;
                i++;
            }
        }
        System.out.println(sum);
    }
}
