package DesignPatterns.Creational;

public class AdultMealBuilder extends MealBuilder {
    protected void buildDrink() {
        meal.setDrink("Coca Cola");
    }

    protected void buildFries() {
        meal.setFries("Large");
    }

}
