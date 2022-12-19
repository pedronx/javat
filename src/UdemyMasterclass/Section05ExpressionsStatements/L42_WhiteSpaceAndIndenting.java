package UdemyMasterclass.Section05ExpressionsStatements;

public class L42_WhiteSpaceAndIndenting {

    public static void main (String[] args) {
        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is " +
                "another " +
                "still more tests.");

        // not recommended
        int anotherVariable = 50; anotherVariable--; System.out.println("anotherVariable = " + anotherVariable);
    }
}
