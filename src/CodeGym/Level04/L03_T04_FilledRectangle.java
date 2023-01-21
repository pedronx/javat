package CodeGym.Level04;

/**
 * Filled rectangle
 * Using nested while loops (a loop within a loop), display a 5 (height) by 10 (width) rectangle filled with the letter 'Q'.
 * >>
 * Example output:
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * QQQQQQQQQQ
 * >>>
 * Requirements:
 *   . The program should display text on the screen.
 *   . The program should display a rectangle with a height of 5 and a width of 10, filled with the letter 'Q'.
 *   . The program must use nested while loops (a loop in a loop).
 *   . The screen output must happen in a while loop.
 */
public class L03_T04_FilledRectangle {

    public static void main (String[] args) {

        int i = 0, j = 0;
        while (i < 5) {
            while (j < 10) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}
