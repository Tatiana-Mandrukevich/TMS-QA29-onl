/*Запускаем проект, делаем заказ
и пробуем обработать его,
используя любые реализации выше упомянутых интерфейсов*/

package lesson7;

import lesson7.domain.DeliveryOrderType;
import lesson7.domain.Food;
import lesson7.impl.CustomerServiceImpl;
import lesson7.impl.OrderProcessorOnlineImpl;
import lesson7.impl.SaveOrderDBImpl;
import lesson7.impl.StatusOrderInProcessImpl;
import lesson7.service.CustomerService;
import lesson7.service.OrderProcessor;
import lesson7.service.SaveOrder;
import lesson7.service.StatusOrder;

public class MainApp {
    public static void main(String[] args) {

        SaveOrder saveToDB = new SaveOrderDBImpl();
        StatusOrder statusInProcess = new StatusOrderInProcessImpl();
        CustomerService customerService = new CustomerServiceImpl(saveToDB, statusInProcess);
        OrderProcessor online = new OrderProcessorOnlineImpl(customerService);
        online.acceptOrder(Food.PANCAKES, 3, DeliveryOrderType.WINDOW);
    }
}
