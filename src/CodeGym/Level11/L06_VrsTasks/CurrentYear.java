package CodeGym.Level11.L06_VrsTasks;

import java.util.Calendar;

/**
 * Current year
 * The Solution class has a currentYear field that must be initialized with the value of the current year (Calendar.getInstance().get(Calendar.YEAR)) when creating a new Solution object.
 * You need to find and fix an error so that the currentYear field is properly initialized when you create a Solution object.
 * Requirements:
 *   . The Solution class must have a private non-static int currentYear field.
 *   . The Solution class must have a getCurrentYear getter for the currentYear field.
 *   . When creating a Solution object, currentYear must be initialized to the current year (use the Calendar.getInstance().get(Calendar.YEAR) method).
 */
public class CurrentYear {

    private int currentYear;

    public CurrentYear() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return this.currentYear;
    }

    public static void main(String[] args) {
        CurrentYear solution = new CurrentYear();
        System.out.println(solution.getCurrentYear());
    }
}
