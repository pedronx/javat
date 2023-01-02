package UdemyMasterclass.Section06ControlFlow;

public class L67_WhileRecap {

    public static void main (String[] args) {

        int number = 0;
        while (number < 15) {
            number++;

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue; // bypass all other code in the loop boby, and continue with the next iteration
            }

            System.out.println("Number = " + number);

            if (number >= 10) {
                System.out.println("Breaking at " + number);
                break; // breaks out of the loop, stop iterating
            }
        }
    }
}
