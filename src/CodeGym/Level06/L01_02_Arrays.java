package CodeGym.Level06;

public class L01_02_Arrays {

    /*--- Task 02 ---*/
    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];
    /*--- Task 03 ---*/
    public static int[] array = new int[]{-1, 2, 3, -4, -5};
    /*--- Task 04 ---*/
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main (String[] args) {

//        creatingArrays(); // Task 01
//        evenAndOddArrayCells(); // Task 02
//        elementsArray(); // Task 03
        combiningArrays(); // Task 04
    }

    /**
     * Creating arrays
     * In the main method, initialize the intArray and doubleArray variables with 10-element arrays of the corresponding types.
     * Requirements:
     *   . In the main(String[]) method, initialize the intArray variable according to the task conditions.
     *   . In the main(String[]) method, initialize the doubleArray variable according to the task conditions.
     */
    public static void creatingArrays() {

        int[] intArray = new int[10];
        double[] doubleArray = new double[10];
    }

    /**
     * Even and odd cells of an array
     * In the main(String[]) method, you need to fill the strings array with values. If the array index is even, then assign the value "Even" (zero is an even number), otherwise assign "Odd".
     * The screen output is not tested.
     * Requirements:
     *   . The Solution class must have a public static String[] strings variable initialized with an array of 5 elements.
     *   . The main(String[]) method must fill the array according to the task conditions.
     */
    public static void evenAndOddArrayCells() {

        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                strings[i] = EVEN;
            } else {
                strings[i] = ODD;
            }
        }

        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);
    }

    /**
     * Working with elements of an array
     * Implement the main(String[]) method so that it reverses the sign of an element of the array array if the element is even.
     * Requirements:
     *   . Implement the main(int[]) method in accordance with the task conditions.
     */
    public static void elementsArray() {

        for (int i = 0; i < 5; i++) {
            if (array[i] % 2 == 0) {
                array[i] *= -1;
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    /**
     * Combining arrays
     * Implement the main(String[]) method, which needs to copy the contents of the firstArray and secondArray arrays into one resultArray array.
     * The firstArray array must be at the beginning of the new resultArray array, followed by the secondArray array.
     * Requirements:
     *   . The Solution class must have a public static int[] firstArray variable initialized with an array with 10 values.
     *   . The Solution class must have a public static int[] secondArray variable initialized with an array with 10 values.
     *   . The Solution class must have a public static int[] resultArray variable.
     *   . Implement the main(String[]) method in accordance with the task conditions.
     */
    public static void combiningArrays() {

        resultArray = new int[firstArray.length + secondArray.length];

        // copy fisrtArray values
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }

        // copy secondArray values
        for (int i = firstArray.length; i < resultArray.length; i++) {
            resultArray[i] = secondArray[i - firstArray.length];
        }

        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
