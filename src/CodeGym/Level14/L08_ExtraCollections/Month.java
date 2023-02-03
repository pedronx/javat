package CodeGym.Level14.L08_ExtraCollections;

import java.security.spec.ECParameterSpec;

public enum Month {
    JANUARY(1,"January", 31),
    FEBRUARY(2, "February", 28),
    MARCH(3, "March", 31),
    APRIL(4, "April", 30),
    MAY(5, "May", 31),
    JUNE(6, "June", 30),
    JULY(7, "July", 31),
    AUGUST(8, "August", 31),
    SEPTEMBER(9, "September", 30),
    OCTOBER(10, "October", 31),
    NOVEMBER(11, "November", 30),
    DECEMBER(12, "December", 31);

    private int index;
    private String name;
    private int daysCount;

    Month(int index, String name, int daysCount) {
        this.index = index;
        this.name = name;
        this.daysCount = daysCount;
    }

    Month(int index) {
        this.index = index;
        this.name = getName(index);
        this.daysCount = getDaysCount();
    }

    public static Month[] getWinterMonths() {

        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSummerMonths() {

        return new Month[]{JUNE, JULY, AUGUST};
    }

    public String getName() {
        return this.name;
    }

    public static String getName(int index) {
        switch (index) {
            case 1:
                return JANUARY.getName();
            case 2:
                return FEBRUARY.getName();
            case 3:
                return MARCH.getName();
            case 4:
                return APRIL.getName();
            case 5:
                return MAY.getName();
            case 6:
                return JUNE.getName();
            case 7:
                return JULY.getName();
            case 8:
                return AUGUST.getName();
            case 9:
                return SEPTEMBER.getName();
            case 10:
                return OCTOBER.getName();
            case 11:
                return NOVEMBER.getName();
            case 12:
                return DECEMBER.getName();
            default:
                return "None";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    @Override
    public String toString() {
        return "Month{" +
                "name='" + name + '\'' +
                ", daysCount=" + daysCount +
                '}';
    }
}
