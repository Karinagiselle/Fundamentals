package DesignPatterns.Creational;

public class SalamiPizza extends PizzaBuilder {
    public void buildSouce() {
        pizza.setSouce("mild");
    }

    public void buildTopping() {
        pizza.setTopping("salami");
    }
}
