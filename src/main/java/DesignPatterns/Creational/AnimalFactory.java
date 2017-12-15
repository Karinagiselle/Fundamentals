package DesignPatterns.Creational;

public class AnimalFactory {

    public static Pet getAnimal(Animal animal) {

        return animal.getPet();
    }
}
