package UdemyMasterclass.Section08OOP_Pt2.L103_CompositionChallenge;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("The coffee is brewing!");
            hasWorkToDo = false;
        }
    }
}
