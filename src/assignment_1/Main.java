package assignment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Singleton: Получаем экземпляр кофейни
        CoffeeShop coffeeShop = CoffeeShop.getInstance();
        Scanner scanner = new Scanner(System.in);

        // Спросим, какой кофе хочет пользователь
        System.out.println("Какой кофе вы хотите? Введите 1 для эспрессо, 2 для капучино:");
        int coffeeChoice = scanner.nextInt();
        Coffee coffee;

        if (coffeeChoice == 1) {
            coffee = new Espresso();
        } else if (coffeeChoice == 2) {
            coffee = new Americano();
        } else {
            System.out.println("Неверный выбор. По умолчанию выбрано эспрессо.");
            coffee = new Espresso();
        }

        // Спросим, какое молоко пользователь хочет
        System.out.println("Какое молоко вы хотите? Введите 1 для обычного молока, 2 для миндального:");
        int milkChoice = scanner.nextInt();
        Milk milk;

        if (milkChoice == 1) {
            milk = new RegularMilk();
        } else if (milkChoice == 2) {
            milk = new AlmondMilk();
        } else {
            System.out.println("Неверный выбор. По умолчанию выбрано обычное молоко.");
            milk = new RegularMilk();
        }

        // Спросим, какой сироп хочет пользователь
        System.out.println("Какой сироп вы хотите? Введите 1 для ванильного, 2 для карамельного:");
        int syrupChoice = scanner.nextInt();
        Syrup syrup;

        if (syrupChoice == 1) {
            syrup = new VanillaSyrup();
        } else if (syrupChoice == 2) {
            syrup = new CaramelSyrup();
        } else {
            System.out.println("Неверный выбор. По умолчанию выбран ванильный сироп.");
            syrup = new VanillaSyrup();
        }

        // Используем Builder для создания кастомного кофе
        CoffeeBuilder coffeeBuilder = new CoffeeBuilder();
        CoffeeOrder order = coffeeBuilder.selectCoffee(coffee)
                .selectMilk(milk)
                .selectSyrup(syrup)
                .build();

        // Прототип: Клонируем заказ
        try {
            CoffeeOrder clonedOrder = order.clone();
            System.out.println("Повторяем заказ:");
            clonedOrder.displayOrder();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Помещаем заказ в кофейню
        coffeeShop.placeOrder(order);

        // Закрываем Scanner
        scanner.close();
    }
}
