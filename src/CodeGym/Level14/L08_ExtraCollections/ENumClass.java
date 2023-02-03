package CodeGym.Level14.L08_ExtraCollections;

import java.util.Arrays;

public class ENumClass {

    public static void main(String[] args) {

        // values(): returns an array of all the values in the Enum:
        System.out.println("values():");
        System.out.println(Arrays.toString(DayOfWeek.values()));

        System.out.println("-".repeat(15));

        // ordinal(): returns the ordinal number of the constant
        // The numbering starts from zero:
        System.out.println("DayOfWeek.SUNDAY.ordinal():");
        int sundayIndex = DayOfWeek.SUNDAY.ordinal();
        System.out.println(sundayIndex);

        System.out.println("-".repeat(15));

        // valueOf(): returns the Enum object that corresponds to the passed name
        System.out.println("DayOfWeek.valueOf(\"SUNDAY\")");
        DayOfWeek sunday = DayOfWeek.valueOf("SUNDAY");
        System.out.println(sunday);
    }

}

class StudentSchedule {

    private DayOfWeek dayOfWeek;
    // ... other fields


    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}

class Student {

    private StudentSchedule schedule;
    private boolean goToSchool;

    public void wakeUp() {

        if (this.schedule.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Hooray, you can sleep more!");
        } else {
            System.out.println("Damn, time for school again :(");
        }
    }
}

class VeryStrictDiet {
    public void takeLunch(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                System.out.println("Sunday Dinner! You can even enjoy something a little sweet today.");
                break;
            case MONDAY:
                System.out.println("Lunch for Monday: chicken noodle soup!");
                break;
            case TUESDAY:
                System.out.println("Tuesday, today it's celery soup :(");
                break;
            //... and so on to the end
        }
    }
}