package UdemyMasterclass.Section08OOP_Pt2.L103_CompositionChallenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("The dishes are whasing!");
            hasWorkToDo = false;
        }
    }
}
