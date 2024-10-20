package assignment_4.Assignment4.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String newsCategory, String news) {
        if ("Наука".equals(newsCategory)) {
            System.out.println("Laptop received news in category 'Наука': " + news);
        }
    }
}
