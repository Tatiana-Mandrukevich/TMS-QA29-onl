package lesson7.impl;

import lesson7.domain.Order;
import lesson7.service.DeliveryOrder;

public class DeliveryOrderHomeImpl implements DeliveryOrder {

    public void deliverOrder(Order order) {
        System.out.println("Доставка заказа до дома клиента.");
    }
}
