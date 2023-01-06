package UdemyMasterclass.Section08OOP_Pt2.L103_CompositionChallenge;

public class SmartKitchen {

    private Refrigerator fridge;
    private DishWasher dishWasher;
    private CoffeeMaker coffeMaker;

    public SmartKitchen() {
        fridge = new Refrigerator();
        dishWasher = new DishWasher();
        coffeMaker = new CoffeeMaker();;
    }

    public Refrigerator getFridge() {
        return fridge;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeeMaker getCoffeMaker() {
        return coffeMaker;
    }

    public void addWater() {
        coffeMaker.setHasWorkToDo(true);
    }

    public void pourMilk() {
        fridge.setHasWorkToDo(true);
    }

    public void loaddishWasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean fridgeFlag, boolean dishWasherFlag, boolean coffeeMakerFlag) {
        fridge.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        coffeMaker.setHasWorkToDo(coffeeMakerFlag);
    }

    public void doKitchenWork() {
        fridge.orderFood();
        dishWasher.doDishes();
        coffeMaker.brewCoffee();
    }
}
