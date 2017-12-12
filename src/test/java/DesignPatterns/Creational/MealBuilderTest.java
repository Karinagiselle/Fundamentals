package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MealBuilderTest {

    @Test
    public void adultMealBuilder() {
        MealDirector director = new MealDirector();
        director.setMealBuilder(new AdultMealBuilder());
        director.constructMeal();

        assertThat(director.getMeal().getDrink()).isEqualTo("Coca Cola");
        assertThat(director.getMeal().getFries()).isEqualTo("Large");
    }

    @Test
    public void kidsMealBuilder() {
        MealDirector director = new MealDirector();
        director.setMealBuilder(new KidMeal());
        director.constructMeal();

        assertThat(director.getMeal().getDrink()).isEqualTo("Fanta");
        assertThat(director.getMeal().getFries()).isEqualTo("Medium");
    }
}
