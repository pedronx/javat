package UdemyMasterclass.S04Basics;

public class VI_SixthClass {

    public static void main(String[] args) {

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        // boolean isDomestic = (makeOfCar != "Volkswagen");

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }
}
