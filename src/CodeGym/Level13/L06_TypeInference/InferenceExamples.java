package CodeGym.Level13.L06_TypeInference;

import java.util.ArrayList;
import java.util.Scanner;

public class InferenceExamples {

    public static void main(String[] args) {

        // Inference of a variable's type: the var keyword
        // var name = value
        var i = 1;  // int i = 1;
        var s = "Hello"; // String s = "Hello";
        var console = new Scanner(System.in); // Scanner console = new Scanner(System.in);
        var list = new ArrayList<String>();  // ArrayList<String> list = new ArrayList<String>();
        var data = new int[]{1, 2, 3}; //int[] data = new int[]{1, 2, 3};

        /* Equivalent code:
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("How's");
        list.add("Life?");
        */
        var aList = new ArrayList<String>()
        {{
            add("Hello");
            add("How's");
            add("Life?");
        }};


    }
}
