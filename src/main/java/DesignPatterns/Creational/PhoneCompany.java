package DesignPatterns.Creational;

public enum PhoneCompany {

    IPHONE("iphone", new IphoneFactory()),
    SAMSUNG("samsung", new SamsungFactory());

    private String name;
    private PhoneFactory phoneFactory;

    PhoneCompany(String name, PhoneFactory phoneFactory) {
        this.name = name;
        this.phoneFactory = phoneFactory;
    }

    public String getName() {
        return name;
    }

    public PhoneFactory getPhoneFactory() {
        return phoneFactory;
    }
}
