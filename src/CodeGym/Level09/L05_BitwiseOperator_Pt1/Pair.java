package CodeGym.Level09.L05_BitwiseOperator_Pt1;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("x=%d, y=%d", x, y);
    }

    public void swap() {

        x ^= y; // 100 ^ 101 = 001
        y ^= x; // 101 ^ 001 = 100 (x)
        x ^= y; // 001 ^ 100 = 101 (y)
    }
}
