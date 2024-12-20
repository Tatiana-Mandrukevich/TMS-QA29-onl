/*Необходимо реализовать сервис со следующими методами
1) Метод принимает на вход массив товаров и тип товара.
Необходимо вернуть стоимость всех товаров указанного типа
2) Метод принимает на вход массив товаров и тип товара.
Необходимо вернуть количество товаров, которые есть в наличии
 */

package lesson6.task1;

public class ProductService {
    public int getSum(Product[] products, ProductType productType) {
        int sum = 0;
        for (Product product : products) {
            if (product.productType == productType) {
                sum += product.productCost;
            }
        }
        return sum;
    }

    public int getCount(Product[] products, ProductType productType) {
        int count = 0;
        for (Product product : products) {
            if (product.productAvailability) {
                count++;
            }
        }
        return count;
    }
}
