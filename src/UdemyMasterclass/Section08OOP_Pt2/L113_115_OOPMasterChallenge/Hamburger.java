package UdemyMasterclass.Section08OOP_Pt2.L113_115_OOPMasterChallenge;

public class Hamburger extends Product {

    Product extra1;
    Product extra2;
    Product extra3;

    public Hamburger(String name, double price) {
        super("Burger", name, price);
    }

    @Override
    public String getName() {
        return super.getName() + " BURGUER";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE": return 1.0;
            case "BACON", "HAM", "SALAMI": return 1.5;
            default: return 0.0;
        }
    }

    public void addToppings(String extra1, String extra2, String extra3) {

        this.extra1 = new Product("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Product("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Product("TOPPING", extra3, getExtraPrice(extra3));
    }

    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
                    extra2.printItem();
        }
        if (extra3 != null) {
                    extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }
}
