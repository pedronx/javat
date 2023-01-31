package CodeGym.Level14.L06_ENum;

public class Month {

    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);

    private  static final Month[] VALUES = {JANUARY, FEBRUARY, MARCH, APRIL, MAY,
            JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

    private final int value;

    public Month(int value) {
        this.value = value;
    }

    public int ordinal() {
        return value;
    }

    public static Month[] values() {
        return VALUES;
    }

    public static Month[] getWinterMonths() {
        return new Month[]{DECEMBER, JANUARY, FEBRUARY};
    }

    public static Month[] getSpringMonths() {
        return new Month[]{MARCH, APRIL, MAY};
    }

    public static Month[] getSummerMonths() {
        return new Month[]{JUNE, JULY, AUGUST};
    }

    public static Month[] getAutumnMonths() {
        return new Month[]{SEPTEMBER, OCTOBER, NOVEMBER};
    }

}
