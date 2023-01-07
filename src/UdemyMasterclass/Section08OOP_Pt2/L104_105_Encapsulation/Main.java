package UdemyMasterclass.Section08OOP_Pt2.L104_105_Encapsulation;

/**
 * Encapsultaion Principles
 *   . Create constructors for object initialization, which enforces that
 *     only objects with valid data will get created.
 *   . Use the private access modifier for your fields.
 *   . User setter and getter methods sparingly, and only as needed.
 *   . Use access modifiers that aren't private, only for the methods
 *     that the calling code needs to use.
 */
public class Main {

    public static void main(String[] args) {

        Player player = new Player("Pedro", "Mace");
        Player anotherPlayer = new Player("Johnny");
        Player evenAnotherPlayer = new Player("Sarah", 200, "Axe"); // invalid health
        Player yetAnotherPlayer = new Player("Zingão", -1, "Knife"); // invalid health

        player.loseHealth(10);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(100);
        System.out.println("Remaining health = " + player.healthRemaining());
        System.out.println(">>>>>>");
        System.out.println(player);
        System.out.println(anotherPlayer);
        System.out.println(evenAnotherPlayer);
        System.out.println(yetAnotherPlayer);
    }
}
