package lesson7.impl;

import lesson7.domain.Order;
import lesson7.service.SaveOrder;

public class SaveOrderDBImpl implements SaveOrder {

    @Override
    public void saveOrder(Order order) {
        System.out.println("Параметры заказа:");
        System.out.println("Блюдо: " + order.getFood());
        System.out.println("Количество: " + order.getCount());
        System.out.println("Способ доставки: " + order.getDeliveryTypeDescription());
    }
}
