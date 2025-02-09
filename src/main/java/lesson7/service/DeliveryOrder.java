/*4) Создаем интерфейс для процесса доставки заказа
4.1) Реализация доставки до дома клиента
4.2) Реализация выдачи заказа через окно выдачи
Дополнительные условия
1) Необходимо в интерфейсе процесса доставки основной метод сделать default (выдача через окно)*/

package lesson7.service;

import lesson7.domain.Order;

public interface DeliveryOrder {

    default void deliverOrder(Order order) {
        System.out.println("Выдача заказа через окно выдачи.");
    }
}
