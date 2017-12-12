package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeroBuilderTest {

    @Test
    public void buildHeroTest() {
        Hero hero = new HeroBuilder("Poker", Profession.WARRIOR)
                            .withArmor(Armor.CLOTHES)
                            .withWeapon(Weapon.AXE)
                            .build();

        assertThat(hero.getName()).isEqualTo("Poker");
        assertThat(hero.getProfessionl()).isEqualTo(Profession.WARRIOR);
        assertThat(hero.getArmor()).isEqualTo(Armor.CLOTHES);
        assertThat(hero.getWeapon()).isEqualTo(Weapon.AXE);
    }

    @Test(expected = IllegalStateException.class)
    public void buildHeroFailTest() {
        new HeroBuilder("Poker", Profession.WARRIOR)
                            .build();
    }

    @Test
    public void buildCarTest() {
        Peugeot peugeot = new Peugeot();

        peugeot.setCarBuilder(new M206Builder());
        peugeot.buildCar();

        Car car = peugeot.getCar();

        assertThat(car.getColor()).isEqualTo("White");
        assertThat(car.getQty_doors()).isEqualTo(4);
    }
}
