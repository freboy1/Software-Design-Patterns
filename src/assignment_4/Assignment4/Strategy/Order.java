package assignment_4.Assignment4.Strategy;

public class Order {
    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateTotalAmount(double orderAmount) {
        return paymentStrategy.calculateFinalAmount(orderAmount);
    }
}