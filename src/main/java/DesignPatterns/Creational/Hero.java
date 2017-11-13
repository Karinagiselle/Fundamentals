package DesignPatterns.Creational;

public class Hero {

    private String name;
    private Profession professionl;
    private Armor armor;
    private Weapon weapon;

    public Hero() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessionl(Profession professionl) {
        this.professionl = professionl;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Profession getProfessionl() {
        return professionl;
    }

    public Armor getArmor() {
        return armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
