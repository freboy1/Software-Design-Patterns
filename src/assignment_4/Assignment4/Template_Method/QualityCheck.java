package assignment_4.Assignment4.Template_Method;

public abstract class QualityCheck {
    // Шаблонный метод
    public final void checkProduct() {
        checkAppearance();  // Шаг 1: Проверка внешнего вида
        checkSpecifics();   // Шаг 2: Проверка специфических характеристик
        generateReport();    // Шаг 3: Заключительный отчёт
    }

    // Реализуемый метод
    private void checkAppearance() {
        System.out.println("Проверка внешнего вида продукта...");
    }

    // Абстрактный метод, который будет реализован в подклассах
    protected abstract void checkSpecifics();

    // Реализуемый метод
    private void generateReport() {
        System.out.println("Генерация заключительного отчета...");
    }
}

