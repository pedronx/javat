package UdemyMasterclass.S04Basics;

public class VII_SeventhClass {

    public static void main(String[] args) {

        double myFirstDValue = 20.00D, mySecondDValue = 80.00D;

        double myDTotal = (myFirstDValue + mySecondDValue) * 100;
        double myDRemainder = myDTotal % 40;

        boolean isRemainderZero = (myDRemainder == 0) ? true : false;
        String s = "" + isRemainderZero;

        System.out.println("The remainder is " + myDRemainder + ".");
        System.out.println("The boolean variable is " + s + ".");

        if (!isRemainderZero) {
            System.out.println("\nGot some remainder: " + myDRemainder + ".");
        }
    }
}
