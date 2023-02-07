package UdemyMasterclass.Section10Lists.L142_143_AutoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {

        // Integer array
        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println("wrapperArray class: " + wrapperArray[0].getClass().getName());

        // Character array
        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println("\n" + Arrays.toString(characterArray));
        System.out.println("characterArray class: " + characterArray[0].getClass().getName());

        // List of ints
        var ourListFromMethod = getList(1, 2, 3, 4, 5);
        var ourListFromFActoryMethod = List.of(1, 2, 3, 4, 5);
        System.out.println("\nList of integers:\n" + ourListFromMethod);
    }

    private static ArrayList<Integer> getList(int... varargs) {

        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }


    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }
}
