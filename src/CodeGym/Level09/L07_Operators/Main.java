package CodeGym.Level09.L07_Operators;

/**
 * Operation Precedence in Java
 * Category 	        | Operator 	        | Associative
 * ------------------------------------------------------
 * Postfix              | () [] .           | From left to right
 * Unary                | ++ -- ! ~         | Right to left
 * Multiplicative       | * / %             | From left to right
 * Additive             | + -               | From left to right
 * Shifting             | >> >>>> <<        | From left to right
 * Relational           | > >= < <=         | From left to right
 * Equality             | == !=             | From left to right
 * Bitwise AND          | &                 | From left to right
 * Exclusive OR (XOR)   | ^                 | From left to right
 * Bitwise OR           | |                 | From left to right
 * Logical AND          | &&                | From left to right
 * Logical OR           | ||                | From left to right
 * Conditional          | ?:                | Right to left
 * Assignment           | = += -= *= /= %=  | Right to left
 *                      | >>= <<= &= ^= |=  | ""
 * Comma                | ,                 | From left to right
 * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 * Prefix and postfix increment
 *      prefix (the operator is placed before the variable)
 *          the expression will use the current value of the variable, and only afterward will the variable be increased
 *              int a = 5;
 *              int b = a++; // b = 5; a = 6
 * >
 *      postfix (the operator is placed after the variable)
 *          the expression will first be increased by x and only afterward will its value be used in the expression
 *              int a = 5;
 *              int b = ++a; // b = 6; a = 6
 *     Java trick interview question
 *          int a = 5;
 *          int b = ++a + ++a; // b = 6 + 6 -> b = 12
 */
public class Main {

    public static void main(String[] args) {

        // Lesson 07 | Task 01
//        taskForCondition();

        // Lesson 07 | Task 02
//        priorities();

        // Lesson 07 | Task 03
        increments();

    }

    /**
     * Logical operators
     * Correct the taskForCondition() method in order to display the number 30 on the console.
     * Only change the logical operators: && to & and || to |.
     * Requirements:
     *   . The taskForCondition() method should display the number 30.
     *   . In the taskForCondition() method, don't change anything except logical operators.
     */
    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25;
        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }

    /**
     * Priorities
     * Correct the main() method in order to display the number 12 on the console.
     * Requirements:
     *   . In the main() method, place one pair of parentheses so that the number 12 is displayed on the console. Don't change the rest of the code.
     *   . The main() method should display the number 12.
     */
    public static void priorities() {

        int number = 2;
        System.out.println(number + number * (number + ++number));
    }

    /**
     * Increments
     * Correct the main() method in order to display the number 20 on the console.
     * You can only change postfix increment operators to prefix increment operators and vice versa, and postfix decrement operators to prefix decrement operators and vice versa.
     * Requirements:
     *   . Correct the main() method in accordance with the task conditions.
     */
    public static void increments() {

        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}
