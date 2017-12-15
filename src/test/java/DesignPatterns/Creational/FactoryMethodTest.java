package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    public void createDog() {
        Animal animal = AnimalFactory.getAnimal("Dog");

        assertThat(animal).isInstanceOf(Dog.class);
    }


    @Test
    public void createCat() {
        Animal animal = AnimalFactory.getAnimal("Cat");

        assertThat(animal).isInstanceOf(Cat.class);
    }
}
