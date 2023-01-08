package UdemyMasterclass.Section08OOP_Pt2.L113_115_OOPMasterChallenge;

public class Product {

    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM";

    public Product(String type, String name, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    public String getName() {

        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }

        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public double getAdjustedPrice() {
        switch(size) {
            case "SMALL":
                return getBasePrice() - 0.5;
            case "LARGE":
                return getBasePrice() + 1;
            default:
                return getBasePrice();
        }
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }
}
