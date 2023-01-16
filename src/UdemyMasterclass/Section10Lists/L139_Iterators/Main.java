package UdemyMasterclass.Section10Lists.L139_Iterators;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main (String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra"); // add to 1st index
        addMoreElements_List(placeToVisit);
        System.out.println("Original list:\n" + placeToVisit);

//        System.out.println("»".repeat(30));
//        printItineraryIterator(placeToVisit);

        System.out.println("»".repeat(30));
        System.out.println("Elements in the list:");
        printTestIterator(placeToVisit);

        System.out.println("»".repeat(30));
        printListIterator(placeToVisit);
        System.out.println("Removed and added an element:\n" + placeToVisit);

        System.out.println("»".repeat(30));
        printReversedIterator(placeToVisit);

    }

    private static void addMoreElements_List(LinkedList<String> list) {

        list.addFirst("Darwin"); // add to start of the list
        list.addLast("Hobart"); // add to end of the list
        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane"); // add to start of the queue
        list.offerLast("Toowoomba"); // add to end of the queue
        // Stack methods
        list.push("Alice Springs"); // add to start of the stack
    }

    // Using an Iterator
    public static void printItineraryIterator(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());

        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1); // starts iterator at the 2nd element
        while(iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void printTestIterator(LinkedList<String> list) {

        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void printListIterator(LinkedList<String> list) {

        var iterator = list.listIterator(); // using a List Iterator (additional funcionalities)
        while (iterator.hasNext()) {
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
                iterator.add("Lake Wivenhoe");
            }
        }
    }

    private static void printReversedIterator(LinkedList<String> list) {

        int lastIndex = list.lastIndexOf(list.getLast());
        var iterator = list.listIterator(lastIndex + 1);
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}