package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    public void createDog() {
        Pet pet = AnimalFactory.getAnimal("Dog");

        assertThat(pet).isInstanceOf(Dog.class);
    }


    @Test
    public void createCat() {
        Pet pet = AnimalFactory.getAnimal("Cat");

        assertThat(pet).isInstanceOf(Cat.class);
    }

    @Test
    public void createDuck() {
        Pet pet = AnimalFactory.getAnimal("Duck");

        assertThat(pet).isNull();
    }
}
