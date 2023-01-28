package CodeGym.Level11.L06_VrsTasks;

/**
 * A hedgehog and an apple
 * Our task is to feed a hedgehog. In the main method, create one Apple object and one Hedgehog object, call the hedgehog's eat method, passing in the appropriate argument (the apple).
 * Requirements:
 *   . The Hedgehog class must have a nested public static Apple class.
 *   . There must be a non-static public void eat(Apple) method in the Hedgehog class.
 *   . In the main method, one Apple object must be created.
 *   . In the main method, one Hedgehog object must be created.
 *   . In the main method, you need to call the eat method on the Hedgehog object and pass in the created Apple object.
 */
public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("The apple was eaten!");
    }

    public static void main(String[] args) {

        Apple apple = new Apple();
        Hedgehog hedgeHog = new Hedgehog();
        hedgeHog.eat(apple);
    }

    public static class Apple {
    }
}
