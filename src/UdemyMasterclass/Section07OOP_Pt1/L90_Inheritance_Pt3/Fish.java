package UdemyMasterclass.Section07OOP_Pt1.L90_Inheritance_Pt3;

public class Fish extends Animal {

    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }

    private void moveMuscles() {
        System.out.print("Muscles moving ");
    }

    private void moveBackFin() {
        System.out.print("Backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }
}
