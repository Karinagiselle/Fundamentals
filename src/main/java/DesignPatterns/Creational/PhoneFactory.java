package DesignPatterns.Creational;

public abstract class PhoneFactory {

    public static PhoneFactory getFactory(PhoneCompany phone) {

        return phone != null ? phone.getPhoneFactory() : null;
    }

    protected abstract Glass createGlass();

    protected abstract PhoneButton createButton();
}
