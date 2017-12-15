package DesignPatterns.Creational;

public class AnimalFactory {

    public static Animal getAnimal(String animal) {

        Animal result = null;
        if ("Dog".equalsIgnoreCase(animal)) {
            result = new Dog();
        } else if ("Cat".equalsIgnoreCase(animal)) {
            result = new Cat();
        }

        return result;
    }
}
