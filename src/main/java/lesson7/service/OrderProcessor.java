/*1) Создаем интерфейс для получения заказа
1.1) Необходима реализация, которая принимает заказ онлайн
1.2) Необходима реализация, которая принимает по телефону*/

package lesson7.service;

import lesson7.domain.DeliveryOrderType;
import lesson7.domain.Food;
import lesson7.domain.Order;

public interface OrderProcessor {

    void acceptOrder(Food food, int foodCount, DeliveryOrderType deliveryOrderType);
}
