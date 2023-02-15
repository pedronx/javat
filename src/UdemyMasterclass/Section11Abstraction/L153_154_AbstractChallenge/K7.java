package UdemyMasterclass.Section11Abstraction.L153_154_AbstractChallenge;

public class K7 extends ProductForSale {

    public K7(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " is a beautiful piece of K7!");
        System.out.printf("The price of this piece is %3.2f %n", price);
        System.out.println(description);
    }
}
