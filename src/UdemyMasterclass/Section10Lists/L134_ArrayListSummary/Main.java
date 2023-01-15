package UdemyMasterclass.Section10Lists.L134_ArrayListSummary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // most common method of creating an array, from an ArrayList
        ArrayList<String> stringLists = new ArrayList<>((List.of("Jan", "Feb", "Mar")));
        String [] stringArray = stringLists.toArray(new String[0]); // pass the list to array, index 0

        System.out.println(Arrays.toString(stringArray));
    }
}
