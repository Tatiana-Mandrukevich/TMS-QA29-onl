package lesson7.impl;

import lesson7.service.PreparingOrder;

public class PreparingOrderInProcessImpl implements PreparingOrder {

    @Override
    public void printOrderStatus() {
        System.out.println("Статус заказа: готовится.");
    }
}
