package assignment_1;

public class CappuccinoIngredientFactory implements CoffeeIngredientFactory{
    public Milk createMilk() {
        return new RegularMilk();
    }

    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}
