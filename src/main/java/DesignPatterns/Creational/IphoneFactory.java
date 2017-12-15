package DesignPatterns.Creational;

public class IphoneFactory extends PhoneFactory {

    protected Glass createGlass() {
        return new IphoneGlass();
    }

    protected PhoneButton createButton() {
        return new IphoneButton();
    }
}
