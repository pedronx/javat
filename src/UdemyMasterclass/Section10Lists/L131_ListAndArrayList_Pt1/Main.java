package UdemyMasterclass.Section10Lists.L131_ListAndArrayList_Pt1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}

public class Main {

    public static void main (String[] args) {

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "PRODUCE", 6);
        groceryArray[2] = "5 Oranges";
        System.out.println(Arrays.toString(groceryArray));

        System.out.println("»".repeat(30));

        GroceryItem anotherGroceryArray[] = new GroceryItem[3];
        anotherGroceryArray[0] = new GroceryItem("Yogurt");
        anotherGroceryArray[1] = new GroceryItem("Oranges", "PRODUCE", 10);
        anotherGroceryArray[2] = new GroceryItem("Carrots", "VEGGIES", 6);
        System.out.println(Arrays.toString(anotherGroceryArray));
    }
}
