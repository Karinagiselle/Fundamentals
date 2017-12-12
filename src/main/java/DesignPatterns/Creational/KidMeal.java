package DesignPatterns.Creational;

public class KidMeal extends MealBuilder {
    protected void buildDrink() {
        meal.setDrink("Fanta");
    }

    protected void buildFries() {
        meal.setFries("Medium");
    }
}
