/*Создаем класс Product со следующими полями
1) название (уникальное)
2) стоимость
3) количество
Создать несколько экземпляров класса Product и добавить их в коллекцию.
Необходимо реализовать методы, которые найдут
1) Товар с определенным именем
2) Все товары, стоимость которых превышает заданную сумму
3) Количество всех товаров
Добавить еще один товар в середину существующего списка
Вывести количество элементов в списке
Вывести, имеется ли последний добавленный товар в данном списке
Вывести все товары от начала списка до последнего добавленного
Создать новый список, который содержит товары в обратной последовательности*/

package lesson10;

import lesson10.service.ProductService;
import lesson10.service.impl.ProductServiceImpl;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Product rose = new Product("rose", 10, 50);
        Product tulip = new Product("tulip", 9, 100);
        Product orchid = new Product("orchid", 8, 30);
        Product chamomile = new Product("chamomile", 7, 200);
        Product peony = new Product("peony", 12, 70);

        List<Product> collection = new LinkedList<>();

        collection.add(rose);
        collection.add(tulip);
        collection.add(orchid);
        collection.add(chamomile);

        ProductService productService = new ProductServiceImpl();

        System.out.println("Product with a specific name:");
        System.out.println(productService.findByName("rose", collection));
        System.out.println();

        System.out.println("All products whose price exceeds the specified value:");
        List<Product> collectionByPrice = productService.findByPrice(7, collection);
        for(Product product : collectionByPrice) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Amount of all products:");
        System.out.println(productService.getAmountAll(collection));
        System.out.println();

        collection.add(2, peony);
        int lastAddedIndex = 2;

        System.out.println("Amount of elements in the list:");
        System.out.println(collection.size());
        System.out.println();

        System.out.println("Is the latest added item in this list?");
        if (collection.contains(peony)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println();

        System.out.println("All products from the beginning of the list to the last added:");
        for (int i = 0; i <= lastAddedIndex; i++) {
            System.out.println(collection.get(i));
        }
        System.out.println();

        System.out.println("A new list that contains products in reverse order:");
        List<Product> reversedCollection = collection.reversed();
        for(Product product : reversedCollection) {
            System.out.println(product);
        }
    }
}
