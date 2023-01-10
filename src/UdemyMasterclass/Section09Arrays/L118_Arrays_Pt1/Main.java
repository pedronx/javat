package UdemyMasterclass.Section09Arrays.L118_Arrays_Pt1;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println("myIntArray[5] = " + myIntArray[5]);

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println("myDoubleArray[2] = " + myDoubleArray[2]);
        System.out.println("myDoubleArray[3] = " + myDoubleArray[3]);
        System.out.println(">".repeat(25) + "\n");

        // Array initializer
        int[] firstFivePositives = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println("firstFivePositives[" + i + "] = " + firstFivePositives[i]);
        }

        System.out.println(">".repeat(25) + "\n");
        String[] names = {"Andy", "Bob", "Charlie", "David", "Eve"};
        for (int i = 0; i < 5; i++) {
            System.out.println("names[" + i + "] = " + names[i]);
        }

        System.out.println(">".repeat(25) + "\n");
        int[] firstTen = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arrayLength = firstTen.length;
        System.out.println("Length of array firstTen = " + arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("firstTen[" + i + "] = " + firstTen[i] + ", ");
        }
    }
}
