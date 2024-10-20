package assignment_4.Assignment4.Strategy;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + (orderAmount * 0.02); // 2% комиссия
    }
}