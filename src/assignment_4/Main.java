package assignment_4;

import assignment_4.Assignment4.Observer.*;
import assignment_4.Assignment4.State.*;
import assignment_4.Assignment4.Strategy.*;
import assignment_4.Assignment4.Template_Method.*;
import assignment_4.Assignment4.Visitor.*;
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

        System.out.println();
        //Strategy
        double orderAmount = 1000.0; // Сумма заказа

        // Создаем стратегии
        PaymentStrategy cardPayment = new CardPaymentStrategy();
        PaymentStrategy walletPayment = new WalletPaymentStrategy();
        PaymentStrategy cashOnDelivery = new CashOnDeliveryStrategy();

        // Создаем заказ с разными стратегиями оплаты
        Order orderWithCard = new Order(cardPayment);
        System.out.println("Итоговая сумма при оплате картой: " + orderWithCard.calculateTotalAmount(orderAmount));

        Order orderWithWallet = new Order(walletPayment);
        System.out.println("Итоговая сумма при оплате электронным кошельком: " + orderWithWallet.calculateTotalAmount(orderAmount));

        Order orderWithCashOnDelivery = new Order(cashOnDelivery);
        System.out.println("Итоговая сумма при наложенном платеже: " + orderWithCashOnDelivery.calculateTotalAmount(orderAmount));
        System.out.println("Спасибо что используете Яндекс доставку");

        System.out.println();
        //Template Method
        // Проверка качества продуктов питания
        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Проверка качества продукта питания:");
        foodCheck.checkProduct();
        System.out.println();

        // Проверка качества электроники
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Проверка качества электроники:");
        electronicsCheck.checkProduct();

        System.out.println();
        //Visitor

        // Создаем файлы
        File textFile = new TextFile("document.txt");
        File executableFile = new ExecutableFile("program.exe");

        // Создаем посетителей
        Visitor antivirus = new AntivirusVisitor();
        Visitor reportGenerator = new ReportVisitor();

        // Запускаем проверку антивирусом
        System.out.println("Проверка файлов:");
        textFile.accept(antivirus);
        executableFile.accept(antivirus);
        System.out.println();

        // Генерируем отчёт о проверке
        System.out.println("Генерация отчёта о проверке:");
        textFile.accept(reportGenerator);
        executableFile.accept(reportGenerator);
    }
}
