package assignment_4.Assignment4.Template_Method;

public class FoodQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Проверка срока годности и состава продукта питания...");
    }
}
