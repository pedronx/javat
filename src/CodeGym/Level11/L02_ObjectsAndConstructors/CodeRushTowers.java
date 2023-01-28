package CodeGym.Level11.L02_ObjectsAndConstructors;

/**
 * CodeRush Towers
 * Let's build a residential complex comprised of three skyscrapers. We'll do this using three different methods for displaying information:
 *   Announces the completion of construction.
 *   Announces the completion of construction and indicates the number of floors.
 *   Announces the completion of construction and indicates the developer.
 * Example output:
 * The skyscraper was built.
 * The skyscraper was built. Number of floors: 50
 * The skyscraper was built. Developer: CodeGymDevelopment
 * To complete this task, you need to declare three different constructors and display text in them.
 * The main method is not tested.
 * Requirements:
 *   . The Skyscraper class should have three public constructors.
 *   . The Skyscraper class should have a no-argument constructor.
 *   . The Skyscraper class should have a constructor with an int parameter.
 *   . The Skyscraper class should have a constructor with a String parameter.
 *   . The output of the no-argument constructor should match the example in the task conditions.
 *   . The output of the constructor with the int parameter should match the example in the task conditions.
 *   . The output of the constructor with the String parameter should match the example in the task conditions.
 */
public class CodeRushTowers {

    public static final String SKYSCRAPER_WAS_BUILT = "The skyscraper was built.";
    public static final String SKYSCRAPER_WAS_BUILT_FLOOR_COUNT = "The skyscraper was built. Number of floors: ";
    public static final String SKYSCRAPER_WAS_BUILT_DEVELOPER = "The skyscraper was built. Developer: ";


    public CodeRushTowers() {
        System.out.println(SKYSCRAPER_WAS_BUILT);
    }

    public CodeRushTowers(int numberOfFloors) {
        System.out.println(SKYSCRAPER_WAS_BUILT_FLOOR_COUNT + numberOfFloors);
    }

    public CodeRushTowers(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILT_DEVELOPER + developer);
    }

    public static void main(String[] args) {

        CodeRushTowers skyscraper = new CodeRushTowers();
        CodeRushTowers skyscraperTower = new CodeRushTowers(50);
        CodeRushTowers skyscraperSkyline = new CodeRushTowers("CodeGymDevelopment");
    }
}
