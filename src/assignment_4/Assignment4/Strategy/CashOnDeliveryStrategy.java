package assignment_4.Assignment4.Strategy;

public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + 300; // Доплата за доставку
    }
}
