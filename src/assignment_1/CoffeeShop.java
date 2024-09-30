package assignment_1;

public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {}

    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void placeOrder(CoffeeOrder coffee) {
        System.out.println("Заказ был принят: ");
        coffee.displayOrder();
    }
}
