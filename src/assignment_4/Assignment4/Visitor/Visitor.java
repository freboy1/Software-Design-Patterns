package assignment_4.Assignment4.Visitor;

public interface Visitor {
    void visit(TextFile textFile);
    void visit(ExecutableFile executableFile);
}

