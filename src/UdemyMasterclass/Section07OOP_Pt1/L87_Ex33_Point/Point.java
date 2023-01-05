package UdemyMasterclass.Section07OOP_Pt1.L87_Ex33_Point;

public class Point {

    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Distance between two points
     * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
     */
    public double distance() {

        Point zero = new Point(0,0);

        double distance = Math.sqrt(((this.x - zero.x) * (this.x - zero.x)) + ((this.y - zero.y) * (this.y - zero.y)));

        return distance;
    }
    public double distance(int x, int y) {

        double distance = Math.sqrt(((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y)));

        return distance;
    }
    public double distance(Point p) {

        double distance = Math.sqrt(((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)));

        return distance;
    }
}