package CodeGym.Level09.L05_BitwiseOperator_Pt1;

/**
 *  & (AND) operator
 *  "the resulting bit is equal to one only if the corresponding bit of the
 *  number a is equal to one AND the corresponding bit of the number b is equal to one"
 *      1 & 1 = 1
 *      1 & 0 = 0
 *      0 & 1 = 0
 *      0 & 0 = 0
 * >
 *  0b0011 & 0b1010 = 0b0010
 *  0b1111 & 0b0000 = 0b0000
 *  0b1010 & 0b0101 = 0b0000
 *  0b1111 & 0b1010 = 0b1010
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 *  | (OR) operator
 *  "the resulting bit is equal to one if the corresponding bit of the
 *  number a is equal to one OR the corresponding bit of the number b is equal to one"
 *      1 | 1 = 1
 *      1 | 0 = 1
 *      0 | 1 = 1
 *      0 | 0 = 0
 * >
 *   0b0011 | 0b1010 = 0b1011
 *   0b1110 | 0b0000 = 0b1110
 *   0b1010 | 0b0101 = 0b1111
 *   0b1111 | 0b1010 = 0b1111
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 *  ^ (XOR - exclusive or) operator
 *  "the resulting bit is equal to one if the corresponding bit of the
 *  number a is equal to one OR the corresponding bit of the number b is equal to one but not both at the same time"
 *      1 ^ 1 = 0
 *      1 ^ 0 = 1
 *      0 ^ 1 = 1
 *      0 ^ 0 = 0
 * >
 *   0b0011 ^ 0b1010 = 0b1001
 *   0b1110 ^ 0b0000 = 0b1110
 *   0b1010 ^ 0b0101 = 0b1111
 *   0b1111 ^ 0b1010 = 0b0101
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 *  ~ (NOT or complement) operator
 *  "the resulting bit is one if the corresponding bit of the
 *  number a is zero, and it is zero if the corresponding bit of the number a is one"
 *      ~1 = 0
 *      ~0 = 1
 * >
 *   ~0b0011 = 0b1100
 *   ~0b0000 = 0b1111
 *   ~0b0101 = 0b1010
 *   ~0b1111 = 0b0000
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 */
public class Main {

    public static void main (String[] args) {

        // Lesson 05 | Task 01
//        bitWise();

        // Lesson 05 | Task 02
        pair();
    }

    /**
     * Bitwise operations
     * Comment out unnecessary lines of code in order to display the number 5.
     * Note: you need to comment out only two lines.
     * Requirements:
     *   . The program should display the number 5
     *   . Don't change the line with the declaration of the variable x.
     *   . Don't change the body of the main(String[]) method. Just comment out 2 specific lines.
     */
    public static void bitWise() {

        int x = 7;
//        x = x & 25;
        x = x & 5;
//        x = x & 3;
        x = x & 12;
        x = x | 1;
        System.out.println(x);
    }

    /**
     * A new kind of swap
     * In the Pair class, implement the swap() method so that it swaps the values of the variables x and y.
     * You can only use these operations:
     *     Exclusive or.
     *     Assignment.
     *     Exclusive or with assignment.
     * Don't add comments. Don't change the rest of the code.
     * Requirements:
     *   . The Pair class must have a swap() method.
     *   . Use only the allowed operations in the swap() method of the Pair class.
     *   . A call to the swap() method should swap the values of the x and y fields.
     *   . Don't change any code other than the swap() method.
     */
    public static void pair() {
        /* Expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
