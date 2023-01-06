package UdemyMasterclass.Section08OOP_Pt2.L103_CompositionChallenge;

public class Refrigerator {

    private boolean hasWorkToDo;

   public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is ordered!");
            hasWorkToDo = false;
        }
    }
}
