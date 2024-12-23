package lesson7.domain;

public class Order {
    private OrderProcessorType orderProcessorType;
    private Food food;
    private int foodCount;
    private DeliveryOrderType deliveryOrderType;

    public Order(OrderProcessorType orderProcessorType, Food food, int foodCount, DeliveryOrderType deliveryOrderType) {
        this.orderProcessorType = orderProcessorType;
        this.food = food;
        this.foodCount = foodCount;
        this.deliveryOrderType = deliveryOrderType;
    }

    public OrderProcessorType getOrderProcessorType() {
        return orderProcessorType;
    }

    public Food getFood() {
        return food;
    }

    public int getCount() {
        return foodCount;
    }

    public DeliveryOrderType getDeliveryType(){
        return deliveryOrderType;
    }

/*    public String getDeliveryTypeDescription(){
        switch (deliveryOrderType){
            case HOME:
                return "Доставка по адресу.";
            case WINDOW:
                return "Выдача в ресторане.";
            default:
                return deliveryOrderType.toString();
        }
    }*/
}
