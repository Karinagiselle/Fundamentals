package DesignPatterns.Behavioral;

public class Paypal implements Payment {

    private String userName;

    Paypal(String userName) {
        this.userName = userName;
    }

    public boolean pay() {
        if (userName == "") {
            throw new IllegalStateException("Paypal user name is needed");
        }

        return true;
    }
}
