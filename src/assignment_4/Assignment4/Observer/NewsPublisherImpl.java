package assignment_4.Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String newsCategory, String news) {
        for (Observer subscriber : subscribers) {
            subscriber.update(newsCategory, news);
        }
    }

    public void publishNews(String newsCategory, String news) {
        System.out.println("Publishing news in category: " + newsCategory + " - " + news);
        notifySubscribers(newsCategory, news);
    }
}
