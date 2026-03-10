package fit.se;

public class Main {
    public static void main(String[] args) {
        MomoPayment momoPayment = new MomoPayment();
        momoPayment.pay(500000);
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(5200000);
    }
}