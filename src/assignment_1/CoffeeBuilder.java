package assignment_1;

public class CoffeeBuilder {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;

    public CoffeeBuilder selectCoffee(Coffee coffee) {
        this.coffee = coffee;
        return this;
    }

    public CoffeeBuilder selectMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CoffeeBuilder selectSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }

    public CoffeeOrder build() {
        return new CoffeeOrder(coffee, milk, syrup);
    }
}
