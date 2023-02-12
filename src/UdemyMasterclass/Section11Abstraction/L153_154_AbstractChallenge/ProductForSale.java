package UdemyMasterclass.Section11Abstraction.L153_154_AbstractChallenge;

public abstract class ProductForSale {

    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public abstract void showDetails();

    public double getSalesPrice(int quantity) {
        return Math.round(this.price * quantity);
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d qty at € %8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }
}
