package CodeGym.Level11.L06_VrsTasks;

/**
 * Buy 10 loaves of bread
 * You've been sent to the grocery store and told that you need to buy one loaf of bread, or if fresh eggs are available, then get ten loaves.
 * Figure out why the makePurchases method always prints "10 loaves of bread purchased" regardless of the arguments passed to the method. Then fix the method.
 * The main method is not checked.
 * Requirements:
 *   . Do not modify the hasEggs field of the Market class.
 *   . The Market class must have a public static void makePurchases(boolean) method.
 *   . If the makePurchases(boolean) method is called with false as the argument, then it should output the following to the console: "1 loaf of bread purchased".
 *   . If the makePurchases(boolean) method is called with true as the argument, then it should output the following to the console: "10 loaves of bread purchased".
 */
public class Market {

    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("10 loaves of bread purchased");
        } else {
            System.out.println("1 loaf of bread purchased");
        }
    }
}
