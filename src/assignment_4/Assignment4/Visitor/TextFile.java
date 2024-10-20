package assignment_4.Assignment4.Visitor;

public class TextFile implements File {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
