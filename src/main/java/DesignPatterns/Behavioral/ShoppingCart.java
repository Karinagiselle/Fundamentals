package DesignPatterns.Behavioral;

public class ShoppingCart {

    private User user;
    private Payment payment;

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ShoppingCart(User user) {
        this.user = user;
    }

    public boolean pay() {
        return payment.pay();
    }
}
