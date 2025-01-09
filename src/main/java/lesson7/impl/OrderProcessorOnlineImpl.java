package lesson7.impl;

import lesson7.domain.DeliveryOrderType;
import lesson7.domain.Food;
import lesson7.domain.Order;
import lesson7.domain.OrderProcessorType;
import lesson7.service.CustomerService;
import lesson7.service.OrderProcessor;

public class OrderProcessorOnlineImpl implements OrderProcessor {

    private CustomerService service;

    public OrderProcessorOnlineImpl(CustomerService service){
        this.service = service;
    }

    @Override
    public void acceptOrder(Food food, int foodCount, DeliveryOrderType deliveryOrderType) {
        Order order = new Order(OrderProcessorType.ONLINE, food, foodCount, deliveryOrderType);
        System.out.println("Заказ принят online.");
        service.processOrder(order);
    }
}
