package assignment_4;

import assignment_4.Assignment4.Observer.*;
import assignment_4.Assignment4.State.*;

public class Main {
    public static void main(String[] args) {
        //Observer
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

        System.out.println();

        //State

        Player player = new Player();

        // Изначально плеер в состоянии остановки
        player.play(); // Воспроизведение начато с начала
        player.pause(); // Пауза. Аудио приостановлено.
        player.stop(); // Воспроизведение остановлено.

        // Переключаемся между состояниями
        player.play(); // Воспроизведение начато с начала
        player.stop(); // Воспроизведение остановлено.
        player.pause(); // Плеер остановлен. Нельзя поставить на паузу.


    }
}
