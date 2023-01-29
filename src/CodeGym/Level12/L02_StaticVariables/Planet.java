package CodeGym.Level12.L02_StaticVariables;

public class Planet {

    public String name;
    public long age;
    public int speed;
    public int area;

    public void printInformation() {
        System.out.println("Planet name: " + name + ".");
        System.out.println("Age: " + age + ".");
        System.out.println("Orbital speed: " + speed + " km/h.");
        System.out.println("Total area: " + area + " km^2.");
    }
}
