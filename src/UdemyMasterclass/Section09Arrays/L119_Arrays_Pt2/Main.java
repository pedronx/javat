package UdemyMasterclass.Section09Arrays.L119_Arrays_Pt2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] newArray;
        newArray = new int[5];

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        // enhanced for loop (for each)
        for (int element : newArray) {
            System.out.print(element + " ");
        }

        System.out.println();

        // Different print method -> toString()
        System.out.println(Arrays.toString(newArray));

        // Verify instanceOf
        Object objectVariable = newArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array.");
        }

        // Array of Objects
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = 2023;

        System.out.println();
        System.out.println(Arrays.toString(objectArray));
    }
}
