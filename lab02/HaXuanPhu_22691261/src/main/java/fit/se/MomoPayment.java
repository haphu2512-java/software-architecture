package fit.se;

public class MomoPayment implements PaymentStrategy{
    public void pay(double amount) { System.out.println("Thanh toán " + amount + " qua ví MOMO."); }
}
