package UdemyMasterclass.Section06ControlFlow;

public class L64_2_ContinueStatement {

    public static void main (String[] args) {

        // While statement without continue
        int number = 0;
        while (number < 50) {
            number += 5;
            System.out.print(number + "_");
        }

        System.out.println("\n");

        // While statement with continue
        int numbEr = 0;
        while (numbEr < 50) {
            numbEr += 5;
            if (numbEr % 25 == 0) { // exclude number divisible by 25
                // breaks out of current iteration and continues the loop
                continue;
            }
            System.out.print(numbEr + "_");
        }
    }
}
