package CodeGym.Level15.L04_TypesOfExceptions;

/**
 * Custom exceptions
 */
public class CustomExceptions {

    public static void main(String[] args)
    {
        throw new MyException(); // Throw an unchecked MyException.
    }
}

class MyException extends RuntimeException {

    MyException() {
        System.out.println("The string cannot be empty!");
    }
}


