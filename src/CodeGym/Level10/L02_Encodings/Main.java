package CodeGym.Level10.L02_Encodings;

public class Main {

    /*--- Lesson 02 | Task 03 ---*/
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {

        // Lesson 02 | Task 01
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber +
                " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber +
                " is equal to decimal number " + toDecimalOctal(octalNumber));
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson 02 | Task 02
        decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimalBinary(binaryNumber));
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson 02 | Task 03
        decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimalHexa(hexNumber));
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson 02 | Task 04
        String anotherBinaryNumber = "100111010000";
        System.out.println("Binary number " + anotherBinaryNumber + " is equal to hexadecimal number " + toHex(anotherBinaryNumber));
        String anotherHexNumber = "9d0";
        System.out.println("Hexadecimal number " + anotherHexNumber + " is equal to binary number " + toBinary(anotherHexNumber));
    }

    /**
     * Octal converter
     * Code 	Notes
     * int x = 015  | x is 13:  1*8^1 + 5*8^0         = 8 + 5
     * int x = 025  | x is 21:  2*8^1 + 5*8^0         = 16 + 5
     * int x = 0123 | x is 83:  1*8^2 + 2*8^1 + 3*8^0 = 1*64 + 1*16 + 3
     */
    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }

        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }

    /**
     * Decimal converter
     */
    public static int toDecimalOctal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }

        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;
    }

    /**
     * Binary converter
     * int x = 0b100        | х is 4:   1*2^2 + 0*2^1 + 0*2^0           = 4 + 0 + 0
     * int x = 0b1111       | х is 15:  1*2^3 + 1*2^2 + 1*2^1 + 1*2^0   = 8 + 4 + 2 + 1
     * int x = 0b1111000111 | х is 967: 1*2^9 + 1*2^8 + 1*2^7 + 1*2^6 + 0*2^5 + 0*2^4 + 0*2^3 + 1*2^2 + 1*2^1 + 1*2^0
     *                                  = 512 + 256 + 128 + 64 + 0 + 0 + 0 + 4 + 2 + 1
     */
    public static String toBinary(int decimalNumber) {

        if (decimalNumber <= 0) {
            return "";
        } else {
            return Integer.toBinaryString(decimalNumber);
        }

    }

    public static int toDecimalBinary(String binaryNumber) {

        if (binaryNumber == null || binaryNumber.isEmpty() || binaryNumber.isBlank()) {
            return 0;
        } else {
            return (int) Double.parseDouble(binaryNumber);
        }
    }

    /**
     * Hexadecimal converter
     * 0x1 	    0b00000001 	    1
     * 0x9 	    0b00001001 	    9
     * 0xA 	    0b00001010 	    10
     * 0xB 	    0b00001011 	    11
     * 0xC 	    0b00001100 	    12
     * 0xD 	    0b00001101 	    13
     * 0xE 	    0b00001110 	    14
     * 0xF 	    0b00001111 	    15
     * 0x1F 	0b00011111 	    31
     * 0xAF 	0b10101111 	    175
     * 0xFF 	0b11111111 	    255
     * 0xFFF 	0b111111111111 	4095
     * -----------------------------
     * 0x11     0b00010001      17
     * 0x29     0b00101001      41
     * 0x55     0b01010101      85
     * 0x100    0b100000000     256
     */
    public static String toHex(int decimalNumber) {

        String hexNumber = "";
        if (decimalNumber <= 0) {
            return hexNumber;
        }

        while (decimalNumber != 0) {
            hexNumber = HEX.charAt(decimalNumber % 16) + hexNumber;
            decimalNumber = decimalNumber / 16;
        }
        return hexNumber;
    }

    public static long toDecimalHexa(String hexNumber) {

        int decimalNumber = 0;
        if (hexNumber == null) {
            return decimalNumber;
        }

        for (int i = 0; i < hexNumber.length(); i++) {
            decimalNumber = 16 * decimalNumber + HEX.indexOf(hexNumber.charAt(i));
        }
        return decimalNumber;
    }

    /**
     * Binary to hexadecimal converter
     * The public static toHex(String) method must convert the string representation of a binary number,
     * received as an input parameter, from the binary numeral system to hexadecimal and return its string representation.
     * And conversely, the public static toBinary(String) method converts from the string
     * representation of a hexadecimal number to the string representation of a binary number.
     * The methods only work with non-empty strings.
     * If the input parameter is an empty string or null, then both methods return an empty string.
     * If the input parameter of the toHex(String) method contains any character
     * other than 0 or 1, then the method returns an empty string.
     * If the input parameter of the toBinary(String) method contains any character other
     * than digits from 0 to 9 or lowercase Latin letters from a to f, then the method returns an empty string.
     * Your task is to implement these methods.
     * >>>
     * One algorithm for converting the string representation of a binary number to the string representation of a hexadecimal number is as follows:
     *     We check the length of the string received in the input parameter. It must be a multiple of 4.
     *     If this is not the case, then add the required number of 0s to the beginning of the string.
     *     We take every four characters (bits) and check which hexadecimal character they correspond to.
     * For example:
     *     the binary representation is "100111010000", where "1001" is "9", "1101" is "d", and "0000" - "0"
     *     the hexadecimal representation is "9d0".
     * One algorithm for converting the string representation of a hexadecimal number to the string representationof a binary number is as follows:
     * We take each character and check which binary number (4 bits) it corresponds to.
     * For example:
     *     the hexadecimal representation is "9d0", where "9" is "1001", "d" is "1101", and "0" is "0000"
     *     the binary representation is "100111010000".
     * The main() method is not involved in testing.
     * Requirements:
     *   . The toHex(String) method needs to be implemented as outlined in the task conditions.
     *   . The toBinary(String) method needs to be implemented as outlined in the task conditions.
     *   . The Integer.toBinaryString(int) and Long.toBinaryString(int) methods cannot be used.
     *   . The Integer.toHexString(int) and Long.toHexString(int) methods cannot be used.
     *   . The Integer.parseInt(String, int) and Long.parseLong(String, int) methods cannot be used.
     *   . The Integer.toString(int, int) and Long.toString(long, int) methods cannot be used.
     *   . You cannot use a BigInteger object.
     *   . You cannot use a BigDecimal object.
     */
    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null) {
            return hexNumber;
        }

        StringBuilder temp = new StringBuilder();
        if (binaryNumber.length() % 4 == 1) {
            temp.append("000").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 2) {
            temp.append("00").append(binaryNumber);
        } else if (binaryNumber.length() % 4 == 3) {
            temp.append("0").append(binaryNumber);
        } else {
            temp.append(binaryNumber);
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < temp.length(); i += 4) {
            String substring = temp.substring(i, i + 4);
            String element;
            if (substring.equals("0001")) {
                element = "1";
            } else if (substring.equals("0010")) {
                element = "2";
            } else if (substring.equals("0011")) {
                element = "3";
            } else if (substring.equals("0100")) {
                element = "4";
            } else if (substring.equals("0101")) {
                element = "5";
            } else if (substring.equals("0110")) {
                element = "6";
            } else if (substring.equals("0111")) {
                element = "7";
            } else if (substring.equals("1000")) {
                element = "8";
            } else if (substring.equals("1001")) {
                element = "9";
            } else if (substring.equals("1010")) {
                element = "a";
            } else if (substring.equals("1011")) {
                element = "b";
            } else if (substring.equals("1100")) {
                element = "c";
            } else if (substring.equals("1101")) {
                element = "d";
            } else if (substring.equals("1110")) {
                element = "e";
            } else if (substring.equals("1111")) {
                element = "f";
            } else {
                element = "0";
            }
            result.append(element);
        }
        return result.toString();
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null) {
            return binaryNumber;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            String element;
            if (hexNumber.charAt(i) == '0') {
                element = "0000";
            } else if (hexNumber.charAt(i) == '1') {
                element = "0001";
            } else if (hexNumber.charAt(i) == '2') {
                element = "0010";
            } else if (hexNumber.charAt(i) == '3') {
                element = "0011";
            } else if (hexNumber.charAt(i) == '4') {
                element = "0100";
            } else if (hexNumber.charAt(i) == '5') {
                element = "0101";
            } else if (hexNumber.charAt(i) == '6') {
                element = "0110";
            } else if (hexNumber.charAt(i) == '7') {
                element = "0111";
            } else if (hexNumber.charAt(i) == '8') {
                element = "1000";
            } else if (hexNumber.charAt(i) == '9') {
                element = "1001";
            } else if (hexNumber.charAt(i) == 'a') {
                element = "1010";
            } else if (hexNumber.charAt(i) == 'b') {
                element = "1011";
            } else if (hexNumber.charAt(i) == 'c') {
                element = "1100";
            } else if (hexNumber.charAt(i) == 'd') {
                element = "1101";
            } else if (hexNumber.charAt(i) == 'e') {
                element = "1110";
            } else if (hexNumber.charAt(i) == 'f') {
                element = "1111";
            } else {
                result.setLength(0);
                ;
                break;
            }
            result.append(element);
        }
        return result.toString();
    }
}
