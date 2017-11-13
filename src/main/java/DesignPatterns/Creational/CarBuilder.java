package DesignPatterns.Creational;

public abstract class CarBuilder {
    protected Car car = new Car();

    public Car getCar() {
        return car;
    }

    public abstract void buildCar();
}
