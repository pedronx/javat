package UdemyMasterclass.S04Basics;

public class ThirdClass {

    public static void main(String[] args) {
        System.out.println("Hello, Tim.");

        /* First implementation
        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");
         */

        /* Second implementation
        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an Alien!");
        else
            System.out.println("It is an Alien!");
        */

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens.");
        } else
            System.out.println("It is an Alien!");
    }
}
