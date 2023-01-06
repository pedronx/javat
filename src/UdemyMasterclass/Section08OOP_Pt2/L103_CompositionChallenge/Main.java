package UdemyMasterclass.Section08OOP_Pt2.L103_CompositionChallenge;

/**
 * In this challenge, you need to create an application for controlling a smart kitchen.
 * Your smart kitchen has several appliances, which can be programmed (IOT).
 * <br>
 <p> <b>Classes diagram</b></p>
 * <pre>
 *  |-------------------------|             |----------------------|
 *  | SmartKitchen            |             | Refrigerator         |
 *  |-------------------------|    |--------|----------------------|
 *  | oven: Oven              |    |        | hasWorkToDo: boolean |
 *  | dishWasher: DishWasher  |    |        |----------------------|
 *  | fridge: Refrigerator    |    |        | orderFood()          |
 *  |-------------------------| -->|        |----------------------|
 *  | addWater()              |    |
 *  | pourMilk()              |    |--------|----------------------|
 *  | loadDishWasher()        |    |        | DishWasher           |
 *  | doKitchenWork()         |    |        |----------------------|
 *  |-------------------------|    |        | hasWorkToDo: boolean |
 *                                 |        |----------------------|
 *                                 |        | doDishes()           |
 *                                 |        |----------------------|
 *                                 |
 *                                 |--------|----------------------|
 *                                          | CoffeeMaker          |
 *                                          |----------------------|
 *                                          | hasWorkToDo: boolean |
 *                                          |----------------------|
 *                                          | brewCoffee()         |
 *                                          |----------------------|
 * </pre>
 *
 * <p> Write the methods on your SmartKitchen class: </p>
 *   <ul><li>addWater() will set the Coffee Maker's hasWorkToDo field to true</li>
 *       <li>pourMilk() will set Refrigerator's hasWorkToDo field to true </li>
 *       <li>loadDishWasher() will set the hasWorkToDo field to true </li>
 *   </ul>
 *
 * >>>
 * <p>To execute the work needed, you'll implement this in two ways.
 * 1st the application will access each appliance (by using a getter), and execute a method.
 * The appliance methods are:</p>
 * <ul><li>orderFood() on Refrigerator</li>
 * <li>doDishes() on DishWasher</li>
 * <li>brewCoffee() on CoffeeMaker</li></ul>
 * <p>These methods should check the hasWorkToDo field, and if true, print a message out, about the work being done.</p>
 * <p>2nd the application won't access the appliances directly.</p>
 * <ul><li> It should call doKitchenWork(), which delegates the work, to any of its appliances. </li></ul>
 */
public class Main {
    public static void main(String[] args) {

        SmartKitchen myKitchen = new SmartKitchen();

        /*
        // start the appliances
        myKitchen.getFridge().setHasWorkToDo(true);
        myKitchen.getDishWasher().setHasWorkToDo(true);
        myKitchen.getCoffeMaker().setHasWorkToDo(true);

        myKitchen.getFridge().orderFood();
        myKitchen.getDishWasher().doDishes();
        myKitchen.getCoffeMaker().brewCoffee();
        */

        // start the appliances in the kitchen > optimized
        myKitchen.setKitchenState(true, true, true);
        myKitchen.doKitchenWork();
    }
}
