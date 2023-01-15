package UdemyMasterclass.Section10Lists.L132_ArrayList_Pt2;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    /*
    @Override // Override toString() method
    public String toString() {
        return String.format("%d %s in %s", count, name.toUpperCase(), type);
    }*/
}

public class Main {

    public static void main (String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>(); // don't need to detail the type with "new"
        groceryList.add(new GroceryItem("Butter"));
        System.out.println(groceryList);

        System.out.println("»".repeat(30));

        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Oranges", "PRODUCE", 5));
        System.out.println(groceryList);

        System.out.println("»".repeat(30));

        groceryList.add(0, new GroceryItem("Apples", "PRODUCE", 6)); // add element in index 0
        System.out.println(groceryList);

        System.out.println("»".repeat(30));
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}
