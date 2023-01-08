package UdemyMasterclass.Section08OOP_Pt2.L113_115_OOPMasterChallenge;

/**
 * Bill's Burger Challenge
 * Bill runs a fast food hamburger restaurante and sells hamburger meals.
 * His meal orders are composed of three items, the hamburger, the drink and the side item.
 * Your application lets Bill select the type of burgers, and some of the additional items, or extras,
 * that can be added to the burgers, as well as the actual pricing.
 * >>>
 * You need a meal order:
 *   . This sould be composed of exactly one burger, one drink and one side item.
 *   . The most common meal order should be created without any arguments,
 *     like a regular burger, a small coke and fries, for example.
 *   . You should be able to create other meal orders, by specifying different burgers, drinks and side items.
 * You need a drink, and side item:
 *   . The drink shoud have at least a type, size and price
 *   . The pice of the drink should change for each size.
 *   . The side item needs at least a type and price.
 * You need burgers:
 *   . Every hamburger should have a burger type, a base price and up to a mix of three extra toppings.
 *   . The constructor should include only the burger type and price.
 *   .  Extra toppings on a burger need to be added somehow, and priced accordingly
 * The deluxe burger bonus:
 *   . Create a deluxe burger meal, with a deluxe burger, that has a set price, so that any
 *     additional toppings do not change the price.
 *   . The deluxe burger should have room for an additional two toppings.
 * Your main method should have code to do the following:
 *   . Create a default meal, that uses the no arguments constructor.
 *   . Create a meal with a burger, and the drink and side item of your choice, with up to 3 extra toppings.
 *   . Create a meal with a deluxe burger, where all items, drink, side item
 *     and toppings (up to 5 extra toppings), are included in the burger price.
 * For each meal order, you'll want to perform theses functions:
 *   . Add some additional toppings to the burger-
 *   . Change the size of the drink.
 *   . Print the itemized list. This should include the price pf the burger,
 *     any extra toppings, the drink price based on the size, and the side item price.
 *   . Print the total due amount for the meal.
 */
public class Main {

    public static void main(String[] args) {

        /*
        Product coke = new Product("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Product avocado = new Product("Topping", "avocado", 1.50);
        avocado.printItem();

        System.out.println("\n" + ">".repeat(30));
        Hamburger burger = new Hamburger("regular", 4.0);
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();

        System.out.println("\n" + ">".repeat(30));
        MealOrder regularMeal = new MealOrder();
        regularMeal.printItemizedList();

        System.out.println("\n" + ">".repeat(30));
        MealOrder anotherRegularMeal = new MealOrder();
        anotherRegularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        anotherRegularMeal.setDrinkSize("LARGE");
        anotherRegularMeal.printItemizedList();

        System.out.println("\n" + ">".repeat(30));
        MealOrder secondMeal = new MealOrder("Turkey", "7-up", "Chili");
        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
        */

        // System.out.println("\n" + ">".repeat(30));
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
    }
}
