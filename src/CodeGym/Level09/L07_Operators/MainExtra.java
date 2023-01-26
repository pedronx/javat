package CodeGym.Level09.L07_Operators;

public class MainExtra {

    public static void main (String[] args) {

        // Lesson extra | ~ bitwise NOT
        int x = 342;
        int y = 169;

        // 01010110 as an integer is 342
        System.out.println(x + " to Binary: " + Integer.parseInt((Integer.toBinaryString(x)))); // output: 101010110
        // 10101001 as an integer is 169
        System.out.println(y + " to Binary: " + Integer.parseInt(Integer.toBinaryString(y))); // output: 10101001
        System.out.println("101010110 to int: " + Integer.parseInt("101010110", 2)); // output: 342
        System.out.println("10101001 to int: " + Integer.parseInt("10101001", 2));  // output: 169

        System.out.println("\nIn IntelliJ, ~342 = -343");
        System.out.println("The bitwise complement for integers is -(N+1)");

        System.out.println("\nIn binary:\n~101010110 (342)\n= 10101001 (169)");
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson extra | & bitwise AND
        System.out.println("100010101    277 as a binary number");
        System.out.println("&");
        System.out.println("110110000    432 as a binary number");
        System.out.println("__________");
        System.out.println("100010000    272 result of the & operator\n");
        int z = (277&432);
        System.out.println("In IntelliJ, 277&432: " + (z));
        System.out.println(z + " to Binary: " + Integer.parseInt((Integer.toBinaryString(z))));
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson extra | - bitwise OR
        System.out.println("100010101    277 as a binary number");
        System.out.println("|");
        System.out.println("110110000    432 as a binary number");
        System.out.println("__________");
        System.out.println("110110101    437 result of the | operator\n");
        int k = (277|432);
        System.out.println("In IntelliJ, 277|432: " + (k));
        System.out.println(k + " to Binary: " + Integer.parseInt((Integer.toBinaryString(k))));
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson extra | << Shift left
        int a = 64;//value
        int b = 3;// Shift distance

        int c = (a << b);
        System.out.println(Integer.toBinaryString(a) + "\t\t " + "(" + a + ")");
        System.out.println("<<");
        System.out.println(Integer.toBinaryString(b) + "\t\t\t " + "(" + b + ")");
        System.out.println("-".repeat(7));
        System.out.println(Integer.toBinaryString(c) + "   (" + c + ")");
        System.out.println("\n" + ">".repeat(33) + "\n");

        // Lesson extra | >> Shift right
        int d = 64;//value
        int e = 2;// Shift distance

        int f = (d >> e);
        System.out.println(Integer.toBinaryString(d) + "\t " + "(" + d+ ")");
        System.out.println(">>");
        System.out.println(Integer.toBinaryString(e) + "\t\t " + "(" + e + ")");
        System.out.println("-".repeat(7));
        System.out.println(Integer.toBinaryString(f) + "    (" + f + ")");
    }
}
