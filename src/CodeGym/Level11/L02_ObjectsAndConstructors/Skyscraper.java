package CodeGym.Level11.L02_ObjectsAndConstructors;

/**
 * Creating a skyscraper
 * Let's try to construct our first skyscraper and announce completion of construction in the console. To do this, you need to call the Skyscraper class constructor in the main method and output "The skyscraper was built." to the console in the body of the constructor.
 * Requirements:
 *   . The Skyscraper class should have a public no-argument constructor.
 *   . In the main method, you need to create one Skyscraper object.
 *   . The Skyscraper class constructor should display "The skyscraper was built." on the console.
 */
public class Skyscraper {

    public Skyscraper() {
        System.out.println("The skyscraper was built.");
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
    }
}
