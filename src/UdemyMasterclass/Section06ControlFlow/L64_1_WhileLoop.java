package UdemyMasterclass.Section06ControlFlow;

public class L64_1_WhileLoop {

    public static void main (String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(">>>");

        // While v.1 - Create the same code using a while loop
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println(">>>");

        // While v.2 - Create the same code using a while loop
        int k = 1;
        while (true) {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
        }

        System.out.println(">>>");

        // Do while - Create the same code using a do while loop
        int m = 1;
        boolean isReady = false;

        do {
            if (m > 5) {
                isReady = true;
            }
            System.out.println(m);
            m++;
        } while (!isReady);
    }
}
