package UdemyMasterclass.Section10Lists.L133_ArrayList_Pt3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main (String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));

        groceries.addAll(nextList); // all list to existin ArrayList

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("\n" + "»".repeat(30) + "\nList contains mustard");
        }

        ///////////////////////////////////////////
        groceries.add("yogurt"); // add duplicate item
        System.out.println("\n" + "»".repeat(30) + "\nfirst index \"yogurt\" = " + groceries.indexOf("yogurt"));
        System.out.println("last index \"yogurt\" = " + groceries.lastIndexOf("yogurt"));

        ///////////////////////////////////////////
        System.out.println("\n" + "»".repeat(30) + "\nOriginal list:\n" + groceries + "\n");
        groceries.remove(1);
        System.out.println("Removed item in index 1:\n" + groceries + "\n");
        groceries.remove("yogurt");
        System.out.println("Removed item \"yogurt\" (1st occurrence):\n" + groceries + "\n");
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println("Removed items \"apples\" & \"eggs\":\n" + groceries + "\n");
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println("Removed all items except \"apples\", \"milk\", \"mustard\" & \"cheese\":\n" + groceries + "\n");
        groceries.clear();
        System.out.println("Removed all existing items:\n" + groceries);
        System.out.println("isEmpty =" + groceries.isEmpty());

        ///////////////////////////////////////////
        groceries.addAll(List.of("apples", "milk", "mustard","cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println("\n" + "»".repeat(30) + "\nAddded new elements:\n" + groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println("\nSorted list:\n" + groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println("\nReversed list:\n" + groceries);

        ///////////////////////////////////////////
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println("\n" + "»".repeat(30) + "\nConverted to Array:\n" + Arrays.toString(groceryArray));

    }
}
