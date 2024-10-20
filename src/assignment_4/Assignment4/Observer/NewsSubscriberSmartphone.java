package assignment_4.Assignment4.Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Спорт".equals(newsCategory)) {
            System.out.println("Smartphone received news in category 'Спорт': " + news);
        }
    }
}