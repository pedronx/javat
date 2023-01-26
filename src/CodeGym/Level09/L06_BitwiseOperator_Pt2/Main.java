package CodeGym.Level09.L06_BitwiseOperator_Pt2;

import java.util.Arrays;

/**
 * a << b   bitwise left shift operator
 * a is the number whose bits are being shifted,
 * b is a number that indicates how many times to shift the bits of the number a to the left.
 * During this operation, the low-order bits added on the right are zeros.
 * >
 *   0b00000011 << 1 = 0b00000110
 *   0b00000011 << 2 = 0b00001100
 *   0b00000011 << 5 = 0b01100000
 *   0b00000011 << 20 = 0b001100000000000000000000
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * a >> b   bitwise right shift operator
 * a is the number whose bits are being shifted,
 * b is the number of times to shift the bits of the number a to the right.
 * During this operation, the high-order bits added on the left are zeros, but not always!
 * >
 *   0b11000011 >> 1 =0b01100001
 *   0b11000011 >> 2 = 0b00110000
 *   0b11000011 >> 5 = 0b00000110
 *   0b11000011 >> 20 = 0b00000000
 * >
 * IMPORTANT: The leftmost bit of a signed number is called the sign bit:
 *            if the number is positive, it is 0;
 *            but if the number is negative, this bit is 1.
 * >
 *  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * a >>> b  right shift operator
 * a is the number whose bits are being shifted,
 * and b  is the number of times to shift the bits of the number a to the right.
 * This operator always appends zeros on the left, regardless of the original value of the sign bit of the number a
 */
public class Main {

    public static void main(String[] args) {

        // Lesson 6 | Task 01
        System.out.println(getPowerOfTwo(3));
        System.out.println(getPowerOfTwo(6));

        // Lesson 06 | Encryption example
        int[] data =  {1, 3, 5, 7, 9, 11};
        int password = 199;

        // Encrypt the array of data
        int[] encrypted = encrypt(data, password);
        System.out.println(Arrays.toString(encrypted));

        // Decrypt the array of data
        int[] decrypted = encrypt(encrypted, password);
        System.out.println(Arrays.toString(decrypted));

    }

    /**
     * Power of two
     * Implement the getPowerOfTwo(int power) method, which returns the value of 2 raised to the power of the power parameter.
     * You need to change the implementation of the getPowerOfTwo(int) method and use an appropriate bitwise shift.
     * Requirements:
     *   . The getPowerOfTwo(int) method should return a power of two.
     *   . The bitwise left shift operator should be used in the getPowerOfTwo(int) method.
     */
    public static int getPowerOfTwo(int power) {

        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }

    /**
     * Encryption
     * The bitwise XOR operation is often used by programmers for simple encryption.
     * In general, such encryption looks like this:
     *      result = number ^ password;
     * Where number is the data we want to encrypt, password is a special number used
     * as a "password" for the data, and result is the encrypted number.
     *      number == (number ^ password) ^ password;
     * The important thing here is that when the XOR operator is applied to a number twice,
     * it produces the original number, regardless of the "password".
     * To recover number from the encrypted result, you just need to perform the operation again:
     *      original number = result ^ password;
     */
    public static int[] encrypt(int[] data, int password)
    {
        int[] result = new int[data.length];
        for (int i = 0; i <  data.length; i++)
            result[i] = data[i] ^ password;
        return result;
    }

    /**
     * Flags
     * Implement the following methods:
     *   setFlag(int number, int flagPos) - sets the bit at the flagPos position in the number number to 1 and returns the new value.
     *   resetFlag(int number, int flagPos) - sets the bit at the flagPos position in the number number to 0 and returns the new value.
     *   checkFlag(int number, int flagPos) - checks the value of the bit at the flagPos position
     *                                        in the number number and returns true if the bit is 1 or false if the bit is 0.
     * Requirements:
     *   . Implement the setFlag(int, int) method in accordance with the task conditions.
     *   . Implement the resetFlag(int, int) method in accordance with the task conditions.
     *   . Implement the checkFlag(int, int) method in accordance with the task conditions.
     */
    public static int setFlag(int number, int flagPos) {
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
