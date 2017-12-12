package DesignPatterns.Creational;

public abstract class MealBuilder {
    protected Meal meal;

    public Meal getMeal() {
        return meal;
    }

    public void createMeal() {
        this.meal = new Meal();
    }

    protected abstract void buildDrink();

    protected abstract void buildFries();
}
