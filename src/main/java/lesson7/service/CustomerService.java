/*5) Создаем основной интерфейс, который будет полностью контролировать обслуживание клиентов
5.1) Делаем его реализацию*/

package lesson7.service;

import lesson7.domain.Order;
import lesson7.domain.OrderProcessorType;

public interface CustomerService {
    OrderProcessor getOrderProcessor(OrderProcessorType orderProcessorType);
    void processOrder(Order order);
}
