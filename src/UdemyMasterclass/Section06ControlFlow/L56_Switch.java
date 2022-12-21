package UdemyMasterclass.Section06ControlFlow;

public class L56_Switch {

    public static void main(String[] args) {

        int value = 5;

        /* // if statement
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        } */

        // Switch statement
        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5: // grouping cases together
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
                break;
        }
    }
}
