package DesignPatterns.Behavioral;

public class CreditCard implements Payment {

    private String creditCardNumber;
    private String cvc;
    private String creditCardName;
    private String dateofExpiracy;

    public CreditCard(String creditCardNumber, String cvc, String creditCardName, String dateofExpiracy) {
        this.creditCardNumber = creditCardNumber;
        this.cvc = cvc;
        this.creditCardName = creditCardName;
        this.dateofExpiracy = dateofExpiracy;
    }

    public boolean pay() {
        if (creditCardNumber == ""|| cvc.length() != 3 || dateofExpiracy.length() != 5) {
            throw new IllegalStateException("Error in Credit Card info");
        }
        return true;
    }
}
