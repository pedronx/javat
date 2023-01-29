package CodeGym.Level13.L04_05_MoreArrayList;

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        this.capacity = (int) Math.round(this.capacity * 1.5);
        String [] copy = Arrays.copyOf(elements, this.capacity);
        this.elements = copy;
    }
}
