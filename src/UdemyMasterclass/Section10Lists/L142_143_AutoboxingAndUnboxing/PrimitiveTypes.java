package UdemyMasterclass.Section10Lists.L142_143_AutoboxingAndUnboxing;

public class PrimitiveTypes {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // preffered but unnecessary
//        Integer deprecatedBoxing = new Integer (15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue();   // unnecessary

        // Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println("autoBoxed class: " + autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName()); // does to work

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer resultIntegerBoxed = returnAnInteger(30);
        int resultIntUnboxed = returnAnInt(resultIntegerBoxed);
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive() {
        return 100.0;
    }

    private static int returnAnInt(Integer i) {
        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }
}
