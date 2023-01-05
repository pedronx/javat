package UdemyMasterclass.Section07OOP_Pt1.L87_Ex34_CarpetCostCalculator;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double lenght) {

        if (width < 0) {
            this.width = 0.0;

            if (lenght < 0) {
                this.length = 0.0;
            }
        } else if (lenght < 0) {
            this.width = width;
            this.length = 0.0;
        } else {
            this.width = width;
            this.length = lenght;
        }
    }

    public double getArea() {
        return (this.width * this.length);
    }
}
