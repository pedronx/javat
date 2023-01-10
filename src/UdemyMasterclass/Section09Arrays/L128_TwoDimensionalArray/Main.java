package UdemyMasterclass.Section09Arrays.L128_TwoDimensionalArray;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int[][] array2 = new int[4][4]; // 4x4 array
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length =" + array2.length);

        System.out.println("»".repeat(20));

        // for each
        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        // regular for loop
        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
