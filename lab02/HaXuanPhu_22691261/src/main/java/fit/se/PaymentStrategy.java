package fit.se;

interface PaymentStrategy {
    void pay(double amount);
}

class CreditCardPayment implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Thanh toán " + amount + " qua Thẻ tín dụng."); }
}

class MomoPayment implements PaymentStrategy {
    public void pay(double amount) { System.out.println("Thanh toán " + amount + " qua ví MOMO."); }
}