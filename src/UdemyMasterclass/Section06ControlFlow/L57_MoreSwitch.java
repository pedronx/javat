package UdemyMasterclass.Section06ControlFlow;

public class L57_MoreSwitch {

    public static void main (String[] args) {

        /*
        int value = 3;

        // Switch statement
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> { // grouping cases together
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + value);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }*/

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        /*
        // Tradicional Switch
        switch(month) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        } */

        // Enhanced Switch Vrs. 1
        switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                return "1st";
            }
            case "APRIL", "MAY", "JUNE" -> {
                return "2nd";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> {
                return "3rd";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                return "4th";
            }
            // should include a default case
        }

        return "bad";

        /*
        // Enhanced Switch Vrs. 2
        return switch(month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        }; */
    }
}
