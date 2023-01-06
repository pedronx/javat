package UdemyMasterclass.Section07OOP_Pt1.L99_StringBuilder;

public class Main {

    public static void main(String[] args) {

        // Instantiating StringBuilder Objects
        StringBuilder helloBuilder = new StringBuilder("Hello");
        StringBuilder emptyBuilder = new StringBuilder();
        StringBuilder emptyBuilder5 = new StringBuilder(5);
        StringBuilder stringBuilder = new StringBuilder(helloBuilder);

        System.out.println(helloBuilder);
        System.out.println(emptyBuilder);
        System.out.println(emptyBuilder5);
        System.out.println(stringBuilder);

        System.out.println(">>>>>>");
        String helloWorld = "Hello" + " World!";
        // StringBuilder helloWorldBuilder = "Hello" + "World"; -> does not compile
        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World!");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // concatenate text to String | append text to StringBuilder
        System.out.println(">>>>>>");
        helloWorld = helloWorld.concat(" and bye bye!");
        helloWorldBuilder.append(" and bye bye!");
        printInformation(helloWorld);
        printInformation(helloWorldBuilder);

        // more stringBuilders
        System.out.println(">>>>>>");
        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);
        printInformation(emptyStart);
        printInformation(emptyStart32);

        System.out.println(">>>>>>");
        emptyStart.append("a".repeat(17));
        emptyStart32.append("a".repeat(17));
        printInformation(emptyStart);
        printInformation(emptyStart32);

        System.out.println(">>>>>>");
        StringBuilder builderPlus = new StringBuilder("Hello" + "World!");
        builderPlus.append(" and bye bye!");
        System.out.println("Original Stringbuilder = " + builderPlus);

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println("Modified Stringbuilder = " + builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println("Modified Stringbuilder again = " + builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println("Reversed Stringbuilder (set length = 7) = " + builderPlus);

    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
