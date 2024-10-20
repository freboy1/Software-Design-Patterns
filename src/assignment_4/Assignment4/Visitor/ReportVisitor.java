package assignment_4.Assignment4.Visitor;

public class ReportVisitor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Создание отчета о проверке текстового файла " + textFile.getFileName() + ".");
        // Логика генерации отчёта
    }

    @Override
    public void visit(ExecutableFile executableFile) {
        System.out.println("Создание отчета о проверке исполняемого файла " + executableFile.getFileName() + ".");
        // Логика генерации отчёта
    }
}
