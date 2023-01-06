package UdemyMasterclass.Section08OOP_Pt2.L103_Ex38_Composition;

public class Ceiling {

    private int height, paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
