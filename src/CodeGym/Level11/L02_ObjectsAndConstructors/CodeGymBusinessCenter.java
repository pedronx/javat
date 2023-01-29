package CodeGym.Level11.L02_ObjectsAndConstructors;

/**
 * CodeGym Business Center
 * Let's build a business center consisting of two buildings. One of the buildings we are just starting to build, while the second is in the planning stage, so little is known about it.
 * You need to create two constructors: one with parameters, and one without. They both need to initialize the floorCount and developer fields.
 * Requirements:
 *   . The Skyscraper class should have two public constructors.
 *   . The Skyscraper class should have a no-argument constructor.
 *   . The Skyscraper class must have a constructor with int and String parameters.
 *   . The Skyscraper class must have a private, non-static int field called floorCount.
 *   . The Skyscraper class must have a private, non-static String field called developer.
 *   . In the no-argument constructor, the fields must be initialized with the values "5" and "CodeGymDevelopment".
 *   . In the constructor with parameters, the fields must be initialized with the arguments passed to the constructor.
 */
public class CodeGymBusinessCenter {

    private int floorsCount;
    private String developer;

    public CodeGymBusinessCenter() {
        this.floorsCount = 5;
        this.developer = "CodeGymDevelopment";
    }

    public CodeGymBusinessCenter(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public  static void main(String[] args) {
        CodeGymBusinessCenter skyscraper = new CodeGymBusinessCenter();
        CodeGymBusinessCenter skyscraperUnknown = new CodeGymBusinessCenter(50, "Unknown");
    }
}
