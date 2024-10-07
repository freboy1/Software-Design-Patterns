package assignment_2.Assignment2;

public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();
    }

    private void loadFromDisk() {
        // Задача: Вывести сообщение о загрузке документа
        System.out.println("Loading RealDocument..."+title);
    }

    @Override
    public void display() {
        // Задача: Вывести сообщение об отображении документа
        System.out.println("Document Display"+title);
    }
}