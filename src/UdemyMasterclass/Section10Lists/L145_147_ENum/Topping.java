package UdemyMasterclass.Section10Lists.L145_147_ENum;

public enum Topping {
    MUSTARD,
    KETCHUP,
    PICKLES,
    CHEDDAR,
    MUSHROOMS,
    TOMATO,
    LETTUCE;

    public double getPrice() {
        return 0.5;
    }

    public double getExtraPrice() {
        return switch (this) {
            case MUSHROOMS -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };
    }
}
