package assignment_1;

class AmericanoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Americano();
    }
}
