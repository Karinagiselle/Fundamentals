package DesignPatterns.Creational;

public class M206Builder extends CarBuilder {
    public void buildCar() {
        car.setColor("White");
        car.setQty_doors(4);
    }
}
