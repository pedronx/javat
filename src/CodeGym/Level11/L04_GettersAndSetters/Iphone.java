package CodeGym.Level11.L04_GettersAndSetters;

/**
 * Two iPhones
 * The main creates two iPhones with identical properties.
 * They are compared and the result is displayed on the console. Figure out why the result is currently negative and make it so the result is positive. To do this, you need to override the equals(IPhone) method and account for all the phone properties.
 * The values of fields must be the same if two objects are equal. The main method is not checked.
 * Requirements:
 *   . The IPhone class must override the public boolean equals(Object) method.
 *   . The equals method must return true for two equal IPhone objects and false for different ones.
 *   . The equals method must return false if null is passed to it.
 */
public class Iphone {

    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Iphone)) {
            return false;
        }

        Iphone iphone = (Iphone) obj;
        return this.model == iphone.model
                && this.color == iphone.color
                && this.price == iphone.price;
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}
