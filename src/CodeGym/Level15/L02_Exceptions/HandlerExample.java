package CodeGym.Level15.L02_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Work as a handler
 * First, figure out what the program does, and then:
 *     In the addUser method, handle the value returned by the setName method:
 *         if setName returns -1, then display: "The name cannot be null."
 *         if it returns -2, then display: "The name cannot be empty."
 *         if it returns -3, then display: "The name cannot contain numbers."
 *         if it returns any other value other than 0, then display: "Unknown error."
 *     In the addUser method, handle the value returned by the setAge method:
 *         if setAge returns -1, then display: "The age cannot be less than 0."
 *         if it returns -2, then display: "The age cannot be greater than 150."
 *         if it returns any other value other than 0, then display "Unknown error."
 *     In the findUserIndex method, handle the value returned by the indexOf method:
 *         if indexOf returns -1, then display "User '<user name>' not found."<имя пользователя>
 *         otherwise, leave the current message
 *     Don't change the User class.
 * Requirements:
 *   . The value returned by the setName method must be handled.
 *   . The value returned by the setAge method must be handled.
 *   . The value returned by the indexOf method must be handled.
 */
public class HandlerExample {

    public static final String INPUT_NAME = "\nEnter a name: ";
    public static final String INPUT_AGE = "Enter the age of user '%s': ";

    public static final String CANNOT_BE_NULL = "The name cannot be null.";
    public static final String CANNOT_BE_EMPTY = "The name cannot be empty.";
    public static final String CANNOT_CONTAIN_DIGIT = "The name cannot contain numbers.";
    public static final String CANNOT_BE_NEGATIVE = "The age cannot be less than 0.";
    public static final String CANNOT_BE_TOO_BIG = "The age cannot be greater than 150.";
    public static final String UNKNOWN_ERROR = "Unknown error.";

    public static final String FOUND = "\nUser '%s' found at index %d.\n";
    public static final String NOT_FOUND = "\nUser '%s' not found.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Raphael");

        System.out.println();
        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        if (user.setName(name) == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (user.setName(name) == -2){
            System.out.println(CANNOT_BE_EMPTY);
        } else if (user.setName(name) == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (user.setName(name) != 0) {
            System.out.println(UNKNOWN_ERROR);
        } else {
            user.setName(name);
        }

        if (user.setAge(age) == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (user.setAge(age) == -2) {
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (user.setAge(age) != 0) {
            System.out.println(UNKNOWN_ERROR);
        } else {
            user.setAge(age);
        }

        users.add(user);
    }

    static void findUserIndex(User user) {

        if (users.indexOf(user) == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }
}