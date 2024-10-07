package assignment_2.Assignment2.Facade;

import assignment_2.Assignment2.Bridge.DocumentRenderer;
import assignment_2.Assignment2.Bridge.RenderEngine;
import assignment_2.Assignment2.Bridge.SimpleDocumentRenderer;
import assignment_2.Assignment2.Decorator.WatermarkDecorator;
import assignment_2.Assignment2.Document;
import assignment_2.Assignment2.Flyweight.DocumentFactory;


// Фасад для работы с документами
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }
    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.
    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }
    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void renderDocument(String title, RenderEngine engine) {
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}
