/*Запускаем проект, делаем заказ
и пробуем обработать его,
используя любые реализации выше упомянутых интерфейсов*/

package lesson7;

import lesson7.domain.DeliveryOrderType;
import lesson7.domain.Food;
import lesson7.domain.OrderProcessorType;
import lesson7.impl.CustomerServiceImpl;
import lesson7.service.OrderProcessor;

public class MainApp {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        OrderProcessor processor = customerService.getOrderProcessor(OrderProcessorType.PHONE);
        processor.acceptOrder(Food.PANCAKES, 3, DeliveryOrderType.WINDOW);
    }
}
