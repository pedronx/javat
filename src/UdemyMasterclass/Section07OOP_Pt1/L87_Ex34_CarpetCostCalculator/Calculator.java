package UdemyMasterclass.Section07OOP_Pt1.L87_Ex34_CarpetCostCalculator;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (this.floor.getArea() * this.carpet.getCost());
    }
}
