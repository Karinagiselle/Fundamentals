package DesignPatterns.Creational;

public class HeroBuilder {
    private Hero hero;

    public HeroBuilder(String name, Profession profession) {
        this.hero = new Hero();
        hero.setName(name);
        hero.setProfessionl(profession);
    }

    public HeroBuilder withArmor(Armor armor) {
        hero.setArmor(armor);
        return this;
    }

    public HeroBuilder withWeapon(Weapon weapon) {
        hero.setWeapon(weapon);
        return this;
    }

    public Hero build() {
        if (hero.getArmor() == null || hero.getWeapon() == null) {
            throw new IllegalStateException("Cannot create hero");
        }

        return hero;
    }
}
