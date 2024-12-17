//Создайте массив из нескольких товаров.

package Lesson6.Task1;

public class Task1 {
    public static void main(String[] args) {
        Product [] list = {
                new Product(ProductType.TV, 100, "TV 1020", true),
                new Product(ProductType.TV, 50, "TV 523", false),
                new Product(ProductType.TV, 80, "TV 980", true),
                new Product(ProductType.AUDIO, 33, "AUDIO 110", false),
                new Product(ProductType.AUDIO, 43, "AUDIO 210", true),
                new Product(ProductType.AUDIO, 53, "AUDIO 310", false),
                new Product(ProductType.MOBILE, 51, "MOBILE 710", true),
                new Product(ProductType.MOBILE, 110, "MOBILE 880", true),
                new Product(ProductType.MOBILE, 210, "MOBILE 990", false),
        };

        ProductService service = new ProductService();
        int sum = service.getSum(list, ProductType.AUDIO);
        System.out.println("Стоимость всех товаров указанного типа: " + sum);

        int count = service.getCount(list, ProductType.MOBILE);
        System.out.println("Количество товаров, которые есть в наличии: " + count);
    }
}
