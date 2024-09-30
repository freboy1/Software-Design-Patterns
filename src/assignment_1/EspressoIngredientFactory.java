package assignment_1;

public class EspressoIngredientFactory implements CoffeeIngredientFactory {
    public Milk createMilk() {
        return new AlmondMilk();
    }

    public Syrup createSyrup() {
        return new CaramelSyrup();
    }
}
