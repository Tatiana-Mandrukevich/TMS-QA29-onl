package lesson7.impl;

import lesson7.domain.Order;
import lesson7.service.CustomerService;
import lesson7.service.SaveOrder;
import lesson7.service.StatusOrder;

public class CustomerServiceImpl implements CustomerService {

    private SaveOrder saveOrder;
    private StatusOrder statusOrder;

    public CustomerServiceImpl(SaveOrder saveOrder, StatusOrder statusOrder) {
        this.saveOrder = saveOrder;
        this.statusOrder = statusOrder;

    }

/*    @Override
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
    }*/

    @Override
    public void processOrder(Order order) {

//      SaveOrderDBImpl saveOrderDB = new SaveOrderDBImpl();
        saveOrder.saveOrder(order);

        statusOrder.printOrderStatus(order);

        switch (order.getDeliveryType()){
            case HOME:
                DeliveryOrderHomeImpl deliveryOrderHome = new DeliveryOrderHomeImpl();
                deliveryOrderHome.deliverOrder(order);
                break;
            case WINDOW:
                DeliveryOrderWindowImpl deliveryOrderWindow = new DeliveryOrderWindowImpl();
                deliveryOrderWindow.deliverOrder(order);
                break;
        }
    }
}
