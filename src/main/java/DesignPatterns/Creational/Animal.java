package DesignPatterns.Creational;

public enum Animal {

    DOG("Dog", new Dog()),
    CAT("Cat", new Cat());


    private String name;
    private Pet pet;

    Animal(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}
