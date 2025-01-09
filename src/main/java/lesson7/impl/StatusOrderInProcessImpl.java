package lesson7.impl;

import lesson7.domain.Order;
import lesson7.service.StatusOrder;

public class StatusOrderInProcessImpl implements StatusOrder {

    @Override
    public void printOrderStatus(Order order) {
        System.out.println("Статус заказа: готовится.");
    }
}
