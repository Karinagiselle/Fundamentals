package DesignPatterns.Creational;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        this.pizza = new Pizza();
    }

    public abstract void buildSouce();
    public abstract void buildTopping();
}
