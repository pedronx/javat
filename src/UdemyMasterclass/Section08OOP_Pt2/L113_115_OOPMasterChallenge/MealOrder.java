package UdemyMasterclass.Section08OOP_Pt2.L113_115_OOPMasterChallenge;

public class MealOrder {

    private Product side;
    private Product drink;
    private Hamburger burger;

    public MealOrder() {
        this("Regular", "Coke", "Fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {

        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Hamburger(burgerType, 4.0);
        }
        this.drink = new Product("drink", drinkType, 1.0);
        this.side = new Product("side", sideType, 1.50);
    }

    public double getTotalPrice() {

        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }

        return side.getAdjustedPrice() + drink.getAdjustedPrice() +
                burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();

        if (burger instanceof DeluxeBurger) {
            Product.printItem(drink.getName(), 0);
            Product.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Product.printItem("TOTAL PRICE", getTotalPrice());

    }

    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {

        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}
