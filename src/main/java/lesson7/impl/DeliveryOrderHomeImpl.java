package lesson7.impl;

import lesson7.service.DeliveryOrder;

public class DeliveryOrderHomeImpl implements DeliveryOrder {

    public void deliverOrder() {
        System.out.println("Заказ готов.");
        System.out.println("Доставка заказа до дома клиента.");
    }
}
