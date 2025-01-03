package lesson10.service.impl;

import lesson10.Product;
import lesson10.service.ProductService;

import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Override
    public Product findByName(String nameSearch, List<Product> collection) {
        for(Product element : collection) {
            if (nameSearch.equals(element.getName())) {
                return element;
            }
        }
        return null;
    }

    @Override
    public List<Product> findByPrice(int priceSearch, List<Product> collection) {
        List<Product> collectionByPrice = new LinkedList<>();
        for(Product element : collection) {
            if (element.getPrice() > priceSearch) {
                collectionByPrice.add(element);
            }
        }
        return collectionByPrice;
    }

    @Override
    public int getAmountAll(List<Product> collection) {
        int amountAll = 0;
        for(Product element : collection) {
            amountAll += element.getAmount();
        }
        return amountAll;
    }
}
