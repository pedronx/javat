package UdemyMasterclass.Section09Arrays.L121_MatchBinarySearch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println("sArray = " + Arrays.toString(sArray));

        // binary search
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        System.out.println("»".repeat(25));
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};
        int[] s3 = {1, 2, 3, 4, 5, 0};

        System.out.println("Array[] s1 = " + Arrays.toString(s1));
        System.out.println("Array[] s2 = " + Arrays.toString(s2));
        System.out.println("Array[] s3 = " + Arrays.toString(s3));
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays s1 & s2 are equal");
        } else {
            System.out.println("Arrays s1 & s2 are not equal");
        }

        if (Arrays.equals(s1, s3)) {
            System.out.println("Arrays s1 & s3 are equal");
        } else {
            System.out.println("Arrays s1 & s3 are not equal");
        }
    }
}
