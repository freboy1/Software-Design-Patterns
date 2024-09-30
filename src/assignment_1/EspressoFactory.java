package assignment_1;

class EspressoFactory extends CoffeeFactory{
    public Coffee createCoffee() {
        return new Espresso();
    }
}
