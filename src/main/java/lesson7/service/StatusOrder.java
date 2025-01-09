/*3) Создаем интерфейс для управления процессом готовки заказа
3.1) Реализация просто выводит информацию, что заказ готовится*/

package lesson7.service;

import lesson7.domain.Order;

public interface StatusOrder {

    void printOrderStatus(Order order);
}
