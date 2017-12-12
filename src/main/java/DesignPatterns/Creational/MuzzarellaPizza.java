package DesignPatterns.Creational;

public class MuzzarellaPizza extends PizzaBuilder {
    public void buildSouce() {
        pizza.setSouce("hot");
    }

    public void buildTopping(){
        pizza.setTopping("olives");
    }
}
