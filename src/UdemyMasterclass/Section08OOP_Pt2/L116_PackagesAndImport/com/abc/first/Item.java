package UdemyMasterclass.Section08OOP_Pt2.L116_PackagesAndImport.com.abc.first;

public class Item {

    private String type;

    public Item(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "type='" + type + '\'' +
                '}';
    }
}
