package DesignPatterns.Creational;

public class AnimalFactory {

    public static Pet getAnimal(String animal) {

        Pet result = null;
        if ("Dog".equalsIgnoreCase(animal)) {
            result = new Dog();
        } else if ("Cat".equalsIgnoreCase(animal)) {
            result = new Cat();
        }

        return result;
    }
}
