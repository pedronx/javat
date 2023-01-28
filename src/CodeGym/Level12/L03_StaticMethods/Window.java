package CodeGym.Level12.L03_StaticMethods;

public class Window {

    private int height = 2;
    private int width = 3;

    public void changeSize(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printSize(){
        System.out.println("Height = " + this.height);
        System.out.println("Width = " + this.width);
    }
}
