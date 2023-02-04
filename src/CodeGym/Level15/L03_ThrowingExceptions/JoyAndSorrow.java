package CodeGym.Level15.L03_ThrowingExceptions;

/**
 * Joy and sorrow sleep in the same bed.
 * Run the program and see what happens.
 * In the eat method, add a finally block so that the lion goes to bed even if he doesn't get anything to eat.
 * Expected output when food != null:
 * looking for food
 * found meat
 * ate everything
 * went to bed
 * Expected output when food == null:
 * looking for food
 * found nothing
 * went to bed hungry
 * Requirements:
 *   . The eat method should have a finally block.
 *   . The output must match the task conditions.
 */
public class JoyAndSorrow {

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat(new Food("meat"));
        lion.eat(null);
    }
}

class Lion {

    public void eat(Food food) {
        try {
            System.out.println();
            System.out.println("looking for food");
            System.out.println("found " + food.name);
            System.out.println("ate everything");
        } catch (NullPointerException e) {
            System.out.println("found nothing");
        } finally {
            System.out.println("went to bed" + (food == null ? " hungry" : ""));
        }
    }
}

class Food {

    String name;

    public Food(String name) {
        this.name = name;
    }
}