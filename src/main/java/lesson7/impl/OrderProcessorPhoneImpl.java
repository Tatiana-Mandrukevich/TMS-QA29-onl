package lesson7.impl;

import lesson7.domain.DeliveryOrderType;
import lesson7.domain.Food;
import lesson7.domain.Order;
import lesson7.domain.OrderProcessorType;
import lesson7.service.CustomerService;
import lesson7.service.OrderProcessor;

public class OrderProcessorPhoneImpl implements OrderProcessor {

    private CustomerService service;

    public OrderProcessorPhoneImpl(CustomerService service){
        this.service = service;
    }

    @Override
    public void acceptOrder(Food food, int foodCount, DeliveryOrderType deliveryOrderType) {
        Order order = new Order(OrderProcessorType.PHONE, food, foodCount, deliveryOrderType);
        System.out.println("Заказ принят по номеру телефона.");
        service.processOrder(order);
    }
}
