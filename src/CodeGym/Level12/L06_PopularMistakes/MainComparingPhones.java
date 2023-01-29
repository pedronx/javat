package CodeGym.Level12.L06_PopularMistakes;

import java.util.Objects;

public class MainComparingPhones {

    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone("Pineapple", "piPhone Z");
        CellPhone cellPhone2 = new CellPhone("Pineapple", "piPhone Z");
        if (cellPhone1.equals(cellPhone2)) {
            System.out.println("The phones are the same");
        }
    }
}

class CellPhone {
    String vendor;
    String model;

    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) o;
        return this.vendor == cellPhone.vendor &&
                this.model == cellPhone.model;
    }
}
