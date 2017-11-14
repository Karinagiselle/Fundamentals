package DesignPatterns.Behavioral;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrategyTest {

    private final int number1 = 10;
    private final int number2 = 5;

    @Test
    public void addTwoNumbers() {
        ArithmeticalOperation operation = new ArithmeticalOperation(new AddOperation());

        int result = operation.executeOperation(number1, number2);

        assertThat(result).isEqualTo(15);
    }

    @Test
    public void substractTwoNumbers() {
        ArithmeticalOperation operation = new ArithmeticalOperation(new SubstractOperation());

        int result = operation.executeOperation(number1, number2);

        assertThat(result).isEqualTo(5);
    }

    @Test
    public void multiplyTwoNumbers() {
        ArithmeticalOperation operation = new ArithmeticalOperation(new MultiplyOperation());

        int result = operation.executeOperation(number1, number2);

        assertThat(result).isEqualTo(50);
    }

    @Test
    public void creditCardPayment() {
        ShoppingCart cart = new ShoppingCart(new User("KarinaBlanco"));
        cart.setPayment(new CreditCard("12321331223", "333", "Karina G Blanco", "08/19"));

        boolean result = cart.pay();

        assertThat(result).isTrue();
    }

    @Test(expected = IllegalStateException.class)
    public void creditCardPaymentFailForLackOfInfo() {
        ShoppingCart cart = new ShoppingCart(new User("KarinaBlanco"));
        cart.setPayment(new CreditCard("", "333", "Karina G Blanco", "08/19"));

        cart.pay();
    }

    @Test
    public void paypalPayment() {
        ShoppingCart cart = new ShoppingCart(new User("KarinaBlanco"));
        cart.setPayment(new Paypal("karinagiselle.b@gmail.com"));

        boolean result = cart.pay();

        assertThat(result).isTrue();
    }
}
