package DesignPatterns.Creational;

public class Peugeot {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void buildCar() {
        carBuilder.buildCar();
    }
}
