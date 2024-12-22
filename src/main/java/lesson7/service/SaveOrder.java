/*2) Создаем интерфейс для сохранения заказа в базу компании
2.1) Реализация будет просто эмулировать сохранение заказа в бд*/

package lesson7.service;

import lesson7.domain.Order;

public interface SaveOrder {

    void saveOrder(Order order);
}
