package lesson10.service;

import lesson10.Product;

import java.util.List;

public interface ProductService {

    public Product findByName(String nameSearch, List<Product> collection);
    public List<Product> findByPrice(int priceSearch, List<Product> collection);
    public int getAmountAll(List<Product> collection);
}
