package lesson10;

public class Product {

    private String name;
    private int price;
    private int amount;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", amount=" + amount + "}";
    }
}
