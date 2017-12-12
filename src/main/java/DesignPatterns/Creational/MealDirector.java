package DesignPatterns.Creational;

public class MealDirector {
    private MealBuilder mealBuilder;

    public void setMealBuilder(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal getMeal() {
        return mealBuilder.getMeal();
    }

    public void constructMeal() {
        mealBuilder.createMeal();
        mealBuilder.buildDrink();
        mealBuilder.buildFries();
    }
}
