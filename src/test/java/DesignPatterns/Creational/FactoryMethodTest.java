package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryMethodTest {

    @Test
    public void createDog() {
        Pet pet = AnimalFactory.getAnimal(Animal.DOG);

        assertThat(pet).isInstanceOf(Dog.class);
    }


    @Test
    public void createCat() {
        Pet pet = AnimalFactory.getAnimal(Animal.CAT);

        assertThat(pet).isInstanceOf(Cat.class);
    }

    @Test(expected = IllegalArgumentException.class)
    public void createDuck() {
        Pet pet = AnimalFactory.getAnimal(Animal.valueOf("Duck"));
    }
}
