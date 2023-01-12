package UdemyMasterclass.Section10Lists.L132_ArrayList_Pt2;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {

    public static void main (String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        System.out.println("\nClass name: " + list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yougurt");
        System.out.println("\n" + "»".repeat(30) + "\n" + groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println("\n" + "»".repeat(30) + "\n" + nextList);

        groceries.addAll(nextList); // all list to existin ArrayList
        System.out.println("\n" + "»".repeat(30) + "\n" + groceries);
    }
}
