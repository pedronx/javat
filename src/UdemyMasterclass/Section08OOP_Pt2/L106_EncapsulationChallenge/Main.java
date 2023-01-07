package UdemyMasterclass.Section08OOP_Pt2.L106_EncapsulationChallenge;

/**
 * In this challenge, create a class named Printer.
 * The fields on the class are going to be:
 *   . tonerLevel - which is the percentage of how much toner level is left
 *   . pagesPrinted - which is th count of total pages printed by the printer.
 *   . duplex - which is a boolean indicator. If true, it can print on 2 sides of a single sheet of paper.
 * On the Printer class, you want to create two methods, which the calling code should be able to access.
 * These methods are;
 *   . addToner() - which takes a tonerAmount argument
 *     + tonerAmount is added to the tonerLevel field
 *     + the tonerLevel should never exceed 100%, or ever get below 0%.
 *     + if the amount being added makes the level fall outside that range, return -1
 *   . printPages() which should take pages to be printed as the argument
 *     + It should determine how many sheets of paper will be printed, based on the duplex value.
 *     + The sheet number should be added to the pagesPrinted value.
 *     + If it's a duplex printer, print a message that it's a duplex printer.
 */
public class Main {

    public static void main(String[] args) {

        Printer aPrinter = new Printer(100, true);

        System.out.printf("Current job pages: %d, Printer total: %d %n", aPrinter.printPages(3), aPrinter.getPagesPrinted());
        System.out.printf("Current job pages: %d, Printer total: %d %n", aPrinter.printPages(2), aPrinter.getPagesPrinted());
        System.out.printf("Current job pages: %d, Printer total: %d %n", aPrinter.printPages(5), aPrinter.getPagesPrinted());
        System.out.printf("Current job pages: %d, Printer total: %d %n", aPrinter.printPages(91), aPrinter.getPagesPrinted());

        aPrinter.setDuplex(false);
        System.out.printf("Current job pages: %d, Printer total: %d %n", aPrinter.printPages(7), aPrinter.getPagesPrinted());
    }
}
