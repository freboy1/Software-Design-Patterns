package assignment_4.Assignment4.Strategy;

public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount; // Без комиссии
    }
}