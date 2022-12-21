package UdemyMasterclass.Section06ControlFlow;

public class L60_TheForLoop {

    public static void main (String [] args){

        // basic for loop
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println(">>>>>>>>>>");

        // rate from 2.0 to 5.0 | increment by
        for (double rate = 2.0; rate <= 5.0; rate++) {
            System.out.println("10,000 at " + rate + "% interest = " + calculateInterestRate(10000.0, rate));
        }

        System.out.println(">>>>>>>>>>");

        // rate from 7.5 to 10.0 | increment by 0.25
        for (double rate = 7.5; rate <=10; rate+= 0.25) {
            System.out.println("$100.00 at " + rate + "% interest = " + calculateInterestRate(100.0, rate));
        }

        System.out.println(">>>>>>>>>>");

        // break when rate reaches 8.5
        for (double rate = 7.5; rate <=10; rate+= 0.25) {
            double interestAmount = calculateInterestRate(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }

            System.out.println("$100.00 at " + rate + "% interest = " + interestAmount);
        }
    }

    /**
     * Calculate interest rate - simple method
     */
    public static double calculateInterestRate(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}
