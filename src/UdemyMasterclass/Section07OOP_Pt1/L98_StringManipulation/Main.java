package UdemyMasterclass.Section07OOP_Pt1.L98_StringManipulation;

public class Main {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");

        System.out.println("Birth date = " + birthDate);
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println(">>>>>>");
        System.out.println("Month = " + birthDate.substring(3, 5)); // subString, first index 3, last index 5

        System.out.println(">>>>>>");
        String newDate = String.join("/", "15", "07", "1975");
        System.out.println("New date = " + newDate);

        // Valid but inneficient
        System.out.println(">>>>>>");
        String newerDate = "09";
        newerDate = newerDate.concat("/");
        newerDate = newerDate.concat("12");
        newerDate = newerDate.concat("/");
        newerDate = newerDate.concat(("1990"));
        System.out.println("Newer date =  " + newerDate);

        // Different ways to perform the same operations
        newerDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("Newer date =  " + newerDate);

        newerDate = "12".concat("/".concat("01")
                .concat("/").concat("1995")); // method chaining
        System.out.println("Newer date =  " + newerDate);

        // Replace methods
        System.out.println(">>>>>>");
        System.out.println("Diff. format (replace) =  " + newerDate.replace('/', '-'));
        System.out.println("Diff. format (replaceFirst) =  " + newerDate.replaceFirst("/", "-"));
        System.out.println("Diff. format (replaceAll) =  " + newerDate.replaceAll("/", "---"));

        // Repeat
        System.out.println(">>>>>>");
        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(5));
        System.out.println("-\n".repeat(5));
        System.out.print("-".repeat(20));

        // Indent method
        System.out.println("\n>>>>>>");
        System.out.println("ABC\n".repeat(3).indent(8));

        System.out.println("\n>>>>>>");
        System.out.println("   ABC\n".repeat(3).indent(-2)); // added 3 spaces in string, removed 2 spaces in indent()
    }
}
