package UdemyMasterclass.Section09Arrays.L124_ReferenceVsValueTypes;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; // both arrays point to the same reference in memory

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1; // update only 1 array (which uses the same reference, points to original array)
        modifyArray(myIntArray); // again, updates the original array, hich also updates the 2nd array/reference

        System.out.println();
        System.out.println("Afterchange myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("Afterchange anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}
