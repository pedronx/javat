package UdemyMasterclass.Section07OOP_Pt1.L94_ThisVsSuper;

/**
 * <b>Constructor chaining</b>
 * <p>The last constructor has the <b>responsibility</b> to initialize the variables</p>
 */
public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle() {
        this(0, 0);
    }

    // 2nd constructor
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    // 3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
