package UdemyMasterclass.Section07OOP_Pt1.L99_Ex37_PoolArea;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {

        /*
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0.0;
        } else {
            this.length = length;
        } */

        // optimized validation
        this.width = (width < 0) ? 0.0 : width;
        this.length = (length < 0) ? 0.0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
