package assignment_4.Assignment4.Observer;

public interface NewsPublisher {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers(String newsCategory, String news);
}
