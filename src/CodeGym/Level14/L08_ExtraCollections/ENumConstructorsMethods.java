package CodeGym.Level14.L08_ExtraCollections;

import java.util.Arrays;

public class ENumConstructorsMethods {

    public static void main(String[] args) {

        HolidayReminder reminder = new HolidayReminder();
        reminder.printHolidays(Month.JANUARY);

        System.out.println("-".repeat(15));

        // get summer months
        System.out.println(Arrays.toString(Month.getSummerMonths()));

        System.out.println("-".repeat(15));

        // iterate over enum
        for(Month month : Month.values()) {
            System.out.println(month);
        }

        System.out.println("-".repeat(15));

        // iterate over enum
        for(Month month : Month.values()) {
            System.out.println(month.getName());
        }

        System.out.println("-".repeat(15));

        for(int i = 1; i <= 12; i++) {
            System.out.println(Month.getName(i));
        }
    }
}

class HolidayReminder {

    public void printHolidays(Month month) {

        switch (month) {

            case JANUARY:
                System.out.println("New Year's Day is January 1st!");
                break;
            case FEBRUARY:
                System.out.println("Valentine's Day is February 14th!");
                break;
            case MARCH:
                System.out.println("Saint Patrick's Day is March 17th!");
                break;
            case APRIL:
                System.out.println("National Beer Day is April 7th!");
                break;
            case MAY:
                System.out.println("International Workers' Day is May 1st!");
                break;
            case JUNE:
                System.out.println("Portugal's Day is June 10th!");
                break;
            case JULY:
                System.out.println("Bastille Day is July 14th!");
                break;
            case AUGUST:
                System.out.println("Holidays is everyday!!!");
                break;
            case SEPTEMBER:
                System.out.println("Virgo Zodiac Sign Day is September 15th!");
                break;
            case OCTOBER:
                System.out.println("Halloween is October 31st!");
                break;
            case NOVEMBER:
                System.out.println("All Saints' Day is November 1st!");
                break;
            case DECEMBER:
                System.out.println("Christmas Day is December 25th!");
                break;
        }
    }
}
