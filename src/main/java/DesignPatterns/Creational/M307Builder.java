package DesignPatterns.Creational;

public class M307Builder extends CarBuilder {

    public void buildCar() {
        car.setColor("Black");
        car.setQty_doors(3);
    }
}
