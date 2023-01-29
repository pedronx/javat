package CodeGym.Level13.L07_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * All classes in Java implicitly inherit the Object class.
 * -------------------------------------------------------
 * In Java, generics means the ability to add type parameters to types. The result is a complex composite type. The general view of such a composite type is this:
 *      ClassName<TypeParameter>
 * ------------------------------------------------------
 * Classes can have several type parameters. It looks something like this:
 *      ClassName<TypeParameter1, TypeParameter2, TypeParameter3>
 * ------------------------------------------------------
 * Generic types can also be used as parameters. It looks something like this:
 *      ClassName<TypeParameter<TypeParameterParameter>>
 * ------------------------------------------------------
 * Generic types (types with type parameters) can also be used as array types. It looks something like this:
 *      ClassName<TypeParameter>[] array = new ClassName<TypeParameter>[size];
 */

public class GenericsExamples {

    public static void main(String[] args) {

        // An object of any class can be assigned to an Object variable
        Object o1 = new Scanner(System.in); // The o variable stores a reference to a Scanner object
        Object o2 = new String(); // The o variable stores a reference to a String object
        Object o3 = "Hello";	// The o variable stores a reference to a String object

        // The instanceof operator checks whether the name variable is a Type object.
        Object[] objects = {10, "Hello", 3.14};

        for (int i = 0; i < objects.length; i++)
        {
            if (objects[i] instanceof String)
            {
                String s = (String) objects[i];
                System.out.println(s);
            }
        }

        // Classes can have several type parameters
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(7, "Hello");
        map.put(-15, "Hello");

        /* Generic types can also be used as parameters */
        // List of greetings
        ArrayList<String> listHello = new ArrayList<String>();
        listHello.add ("Hello");
        listHello.add ("Hi");

        // List of goodbyes
        ArrayList<String> listBye = new ArrayList<String>();
        listBye.add("Bye");
        listBye.add ("Goodbye");

        // List of lists
        ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
        lists.add(listHello);
        lists.add(listBye);
    }
}
