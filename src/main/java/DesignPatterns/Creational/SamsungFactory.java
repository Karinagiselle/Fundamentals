package DesignPatterns.Creational;

public class SamsungFactory extends PhoneFactory {
    protected Glass createGlass() {
        return new SamsungGlass();
    }

    protected PhoneButton createButton() {
        return new SamsungButton();
    }
}
