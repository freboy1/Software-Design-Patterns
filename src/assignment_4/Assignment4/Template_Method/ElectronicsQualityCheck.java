package assignment_4.Assignment4.Template_Method;

public class ElectronicsQualityCheck extends QualityCheck {
    @Override
    protected void checkSpecifics() {
        System.out.println("Проверка работоспособности и наличия гарантии электроники...");
    }
}
