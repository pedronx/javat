package CodeGym.Level11.L03_Initialization;

/**
 * Serial entrepreneur
 * A building was constructed with the expectation that it would be used as a restaurant, but the owners later decided to remodel the space for use as a barbershop. We need to ensure that the building is a versatile space whose purpose can be changed without constructing a new building.
 * To do this, create an initialize method that assigns a value to the type field (which determines the type of building), and remove the constructor.
 * Requirements:
 *   . The Building class must have a private String field called type.
 *   . There should be no constructors declared in the Building class.
 *   . The Building class must have a public non-static void initialize method with a String parameter.
 *   . The type field must be initialized in the initialize(String) method.
 */
public class Building {

    private String type;

    public Building(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //write your code here

    public static void main(String[] args) {
        Building building = new Building("Restaurant");
        building.initialize("Barbershop");
        System.out.println(building.getType().toString());
    }

    public void initialize(String s) {
        this.type = s;
    }
}
