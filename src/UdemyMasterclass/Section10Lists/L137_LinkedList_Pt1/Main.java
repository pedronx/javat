package UdemyMasterclass.Section10Lists.L137_LinkedList_Pt1;

import java.util.LinkedList;

public class Main {

    public static void main (String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<>();

        placeToVisit.add("Sydney");
        placeToVisit.add(0, "Canberra"); // add to 1st index

        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        addMoreElements_List(placeToVisit);
        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        addMoreElements_Queue(placeToVisit);
        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        addMoreElements_Stack(placeToVisit);
        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        removeElements(4, placeToVisit);
        removeElements("Brisbane", placeToVisit);
        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        removeElements(placeToVisit);
        System.out.println(placeToVisit);

        System.out.println("\n" + "»".repeat(30) + "\n");
        placeToVisit.push("Perth");
        System.out.println(placeToVisit);
        String p4 = placeToVisit.pop(); // removes 1st element
        System.out.println(p4 + " was removed from the list.");
        System.out.println(placeToVisit);

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

    // Remove element, by the "String" element
    private static void removeElements(String element, LinkedList<String> list) {
        list.remove(element);
    }

    // Remove element, by the list index
    private static void removeElements(int index, LinkedList<String> list) {
        list.remove(index);
    }

    // Removes element, 1st on the list
    private static void removeElements(LinkedList<String> list) {

        String s1 = list.remove();
        System.out.println(s1 + " was removed from the list.");

        /*
        // List - other methods
        String s2 = list.removeFirst();
        String s3 = list.removeLast();

        // Queue/Dequeue methods
        String s4 = list.poll();
        String s5 = list.pollFirst();
        String s6 = list.pollLast();
         */
    }
}