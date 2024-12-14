/* Создайте класс продукт со следующими полями
1) Тип товара (enum - MOBILE, TV, AUDIO)
2) Стоимость товара
3) Наименование - string
4) Наличие - boolean*/

package Lesson6.Task1;

public class Product {
    public ProductType productType;
    public int productCost;
    public String productName;
    public boolean productAvailability;

    public Product(ProductType productType, int productCost, String productName, boolean productAvailability) {
        this.productType = productType;
        this.productCost = productCost;
        this.productName = productName;
        this.productAvailability = productAvailability;
    }
}
