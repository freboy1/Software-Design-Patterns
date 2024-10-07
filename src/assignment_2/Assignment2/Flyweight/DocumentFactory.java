package assignment_2.Assignment2.Flyweight;

import assignment_2.Assignment2.Document;
import assignment_2.Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Задача: Реализуйте фабрику, которая будет хранить и переиспользовать документы,
    // чтобы не создавать их повторно для одного и того же заголовка.
    public static Document getDocument(String title) {
        Document document = documentMap.get(title);

        if (document == null) {
            document = new RealDocument(title);
            documentMap.put(title, document);
        }

        return document;
    }
}

