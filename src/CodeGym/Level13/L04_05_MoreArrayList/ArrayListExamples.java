package CodeGym.Level13.L04_05_MoreArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListExamples {

    public static void main (String[] args) {

        // Example 1 - List all the even numbers in the range from 1 to 20
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 20; i++)
            if (i%2 == 0)
                list.add(i);

        System.out.println("Print ArrayList of Integers:");
        printArraylist(list);
        System.out.println();

        ArrayList<String> stringList = new ArrayList<String>();

        String[] randomWords = generateRandomWords(20);
        for (int i = 1; i < 20; i++)
            if (i%2 == 0) {
                stringList.add(randomWords[i]);
            }

        System.out.println("Print ArrayList of Strings:");
        printArraylist(stringList);
    }

    // print ArrayList, independent of Type (String or Integers)
    public static <T> void printArraylist(List<T> list){
        System.out.println(list);

        T item = list.get(0);
        System.out.println("with type ["+ item.getClass() +"]");
    }

    // create a x number of random words (3 to 10 character long)
    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }
}
