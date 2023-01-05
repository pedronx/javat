package UdemyMasterclass.Section07OOP_Pt1.L84_StaticVsInstanceVariables;

public class DogInstance {

    private String name;

    public DogInstance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name = " + this.name);
    }
}
