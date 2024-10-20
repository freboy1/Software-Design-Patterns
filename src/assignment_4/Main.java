package assignment_4;

import assignment_4.Assignment4.Observer.*;

public class Main {
    public static void main(String[] args) {
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        newsPublisher.addSubscriber(smartphoneSubscriber);
        newsPublisher.addSubscriber(laptopSubscriber);
        newsPublisher.addSubscriber(tabletSubscriber);

        // Публикуем новости
        newsPublisher.publishNews("Спорт", "Новость о победе команды!");
        newsPublisher.publishNews("Наука", "Новое открытие в физике!");
        newsPublisher.publishNews("Политика", "Новость о политической ситуации.");
    }
}
