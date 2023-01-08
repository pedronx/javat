package UdemyMasterclass.Section08OOP_Pt2.L113_115_OOPMasterChallenge;

public class DeluxeBurger extends Hamburger{

    Product deluxe1;
    Product deluxe2;

    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Product("TOPPING", extra4, 0.0);
        deluxe2 = new Product("TOPPING", extra5, 0.0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if (deluxe1 != null) {
            deluxe1.printItem();
        }
        if (deluxe2 != null) {
            deluxe2.printItem();
        }
    }

    @Override
    public double getExtraPrice(String toppingName) {
        return 0.0;
    }
}
