package UdemyMasterclass.Section10Lists.L138_LinkedList_Pt2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main (String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra"); // add to 1st index
        addMoreElements_List(placeToVisit);
        addMoreElements_Queue(placeToVisit);
        addMoreElements_Stack(placeToVisit);

        System.out.println("Original list:\n" + placeToVisit);

        System.out.println("»".repeat(30));
        getElements(placeToVisit);

        System.out.println("»".repeat(30));
        printItinerary(placeToVisit);

        System.out.println("»".repeat(30));
        printItineraryIterator(placeToVisit);

    }

    private static void addMoreElements_List(LinkedList<String> list) {

        list.addFirst("Darwin"); // add to start of the list
        list.addLast("Hobart"); // add to end of the list
    }

    private static void addMoreElements_Queue(LinkedList<String> list) {

        // Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane"); // add to start of the queue
        list.offerLast("Toowoomba"); // add to end of the queue
    }

    private static void addMoreElements_Stack(LinkedList<String> list) {

        // Stack methods
        list.push("Alice Springs"); // add to start of the stack
    }

    private static void getElements(LinkedList<String> list) {

        System.out.println("Retrieved element (index 4): " + list.get(4));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("\nDarwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("\nElement from element(): " + list.element());
        // Stack retrieval methods
        System.out.println("Element from peek(): " + list.peek());
        System.out.println("Element from peekFirst(): " + list.peekFirst());
        System.out.println("Element from peekLast(): " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {

        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    // Using a List Iterator
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
}