package DesignPatterns.Creational;

public abstract class PhoneFactory {

    public static PhoneFactory getFactory(String phone) {

        if("Iphone".equalsIgnoreCase(phone)) {
            return new IphoneFactory();

        } else if("Samsung".equalsIgnoreCase(phone)){
            return new SamsungFactory();
        }
        return null;
    }

    protected abstract Glass createGlass();
    protected abstract PhoneButton createButton();
}
