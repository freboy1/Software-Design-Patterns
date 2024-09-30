package assignment_1;

abstract class Coffee {
    String description = "Nothing";

    public String getDescription() {
        return description;
    }

    public abstract int price();
}
