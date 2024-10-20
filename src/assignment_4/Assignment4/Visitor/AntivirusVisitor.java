package assignment_4.Assignment4.Visitor;

public class AntivirusVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Проверка текстового файла " + textFile.getFileName() + " на запрещённые слова.");
        // Логика проверки на запрещённые слова
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Проверка исполняемого файла " + executableFile.getFileName() + " на наличие вредоносного кода.");
        // Логика проверки на наличие вредоносного кода
    }
}
