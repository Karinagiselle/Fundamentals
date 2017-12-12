package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PizzaBuilderTest {

    @Test
    public void pizzaBuilderCreateMuzzarellaPizza() {
        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(new MuzzarellaPizza());
        waiter.constructPizza();
        Pizza pizza = waiter.getPizza();

        assertThat(pizza.getSouce()).isEqualTo("hot");
        assertThat(pizza.getTopping()).isEqualTo("olives");
    }

    @Test
    public void pizzaBuilderCreateSalamiPizza() {
        Waiter waiter = new Waiter();
        waiter.setPizzaBuilder(new SalamiPizza());
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        assertThat(pizza.getSouce()).isEqualTo("mild");
        assertThat(pizza.getTopping()).isEqualTo("salami");
    }
}
