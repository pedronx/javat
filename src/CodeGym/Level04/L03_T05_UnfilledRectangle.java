package CodeGym.Level04;

/**
 * Unfilled rectangle
 * Using nested while loops (a loop within a loop), display an unfilled rectangle (just an outline) that is 10 (height) by 20 (width) and made from the letter 'B'.
 * The unfilled part consists of spaces.
 * >>>
 * Example output:
 * BBBBBBBBBBBBBBBBBBBB
 * B                  B
 * B                  B
 * B                  B
 * B                  B
 * B                  B
 * B                  B
 * B                  B
 * B                  B
 * BBBBBBBBBBBBBBBBBBBB
 * >>>
 * Requirements:
 *   . The program should display text on the screen.
 *   . The program should draw the outline of a rectangle with a height of 10 and a width of 20, made from the letter 'B'.
 *   . The program must use nested while loops (a loop in a loop).
 *   . The screen output must happen in a while loop.
 */
public class L03_T05_UnfilledRectangle {

    public static void main (String[] args) {

        int i = 0, j = 0;
        int height = 10, width = 20;

        while (i < height) {
            while (j < width) {
                if (i == 0 || i == height - 1) {
                    System.out.print("B");
                    j++;
                } else {
                    if (j == 0 || j == (width - 1)) {
                        System.out.print("B");
                        j++;
                    } else {
                        System.out.print(" ");
                        j++;
                    }
                }
            }
            i++;
            j = 0;
            System.out.println();
        }
    }
}
