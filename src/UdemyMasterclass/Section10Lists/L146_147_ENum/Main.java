package UdemyMasterclass.Section10Lists.L146_147_ENum;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DaysOfTheWeek weekDay = DaysOfTheWeek.TUESDAY;
        System.out.println(weekDay);

        System.out.printf("\nName is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
        System.out.println();

        // Get random days of the week and print them
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());

            if (weekDay == DaysOfTheWeek.FRIDAY) {
                System.out.println("Found a Friday!!!");
            }
        }

        // print the day of a given DayOfTheWeek
        System.out.println();
        switchDayOfWeek(weekDay);

        // Loop through Toppings
        System.out.println();
        System.out.println("List of Toppings (enum)");
        for (Topping topping : Topping.values()) {
            System.out.printf("%s : %.2f %n", topping.name(), topping.getExtraPrice());
        }
    }

    public static DaysOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfWeek(DaysOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case MONDAY -> System.out.printf("Monday is Day %d%n", weekDayInteger);
            case TUESDAY -> System.out.printf("Tuesday is Day %d%n", weekDayInteger);
            case WEDNESDAY -> System.out.printf("Wednesday is Day %d%n", weekDayInteger);
            case THURSDAY -> System.out.printf("Thursday is Day %d%n", weekDayInteger);
            case FRIDAY -> System.out.printf("Friday is Day %d%n", weekDayInteger);
            case SATURDAY -> System.out.printf("Saturday is Day %d%n", weekDayInteger);
            case SUNDAY -> System.out.printf("Sunday is Day %d%n", weekDayInteger);
            default -> System.out.println("Incorrect Day of the Week");
        }
    }
}
