package UdemyMasterclass.Section12Generics.L01GenericsIntro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // without Generics
        ArrayList items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        // with Generics
        ArrayList<Integer> itemsInt = new ArrayList<>();
        itemsInt.add(1);
        itemsInt.add(2);
        itemsInt.add(3);
        itemsInt.add(4);
        itemsInt.add(5);

        System.out.println();
        printDoubled(itemsInt);

        ArrayList<String> itemsString = new ArrayList<>();
        itemsString.add("String 1");
        itemsString.add("String 2");

        System.out.println();
        printDoubled(itemsString);
    }

    private static void printDoubled(ArrayList l) {
        for (Object i : l) {
            if (i instanceof Integer) {
                System.out.println((Integer) i * 2);
            } else if (i instanceof Double) {
                System.out.println(Math.round(((Double) i * 2)));
            } else {
                System.out.println(i);
            }
        }
    }

}
