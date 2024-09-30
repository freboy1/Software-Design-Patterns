package assignment_1;

public class CoffeeOrder implements Cloneable{
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }

    public void displayOrder() {
        System.out.println("Кофе: " + coffee.getDescription() + ", Молоко: " + milk.GetMilk() + ", Сироп: " + syrup.GetSyrup());
    }

    public CoffeeOrder clone() throws CloneNotSupportedException {
        return (CoffeeOrder) super.clone();
    }
}
