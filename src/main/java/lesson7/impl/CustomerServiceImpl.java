package lesson7.impl;

import lesson7.domain.Order;
import lesson7.domain.OrderProcessorType;
import lesson7.service.CustomerService;
import lesson7.service.OrderProcessor;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public OrderProcessor getOrderProcessor(OrderProcessorType orderProcessorType) {
        switch (orderProcessorType){
            case PHONE:
                OrderProcessorPhoneImpl orderProcessorPhone = new OrderProcessorPhoneImpl(this);
                return orderProcessorPhone;
            case ONLINE:
                OrderProcessorOnlineImpl orderProcessorOnline = new OrderProcessorOnlineImpl(this);
                return orderProcessorOnline;
            default:
                return null;
        }
    }

    @Override
    public void processOrder(Order order) {

        SaveOrderDBImpl saveOrderDB = new SaveOrderDBImpl();
        saveOrderDB.saveOrder(order);

        PreparingOrderInProcessImpl preparingOrderInProcess = new PreparingOrderInProcessImpl();
        preparingOrderInProcess.printOrderStatus();

        switch (order.getDeliveryType()){
            case HOME:
                DeliveryOrderHomeImpl deliveryOrderHome = new DeliveryOrderHomeImpl();
                deliveryOrderHome.deliverOrder();
                break;
            case WINDOW:
                DeliveryOrderWindowImpl deliveryOrderWindow = new DeliveryOrderWindowImpl();
                deliveryOrderWindow.deliverOrder();
                break;
        }
    }
}
