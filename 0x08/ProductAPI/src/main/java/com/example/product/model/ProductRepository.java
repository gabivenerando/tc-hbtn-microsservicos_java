package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        return list;
    }

    public Product getProductById(Integer id) {
        return list.stream().filter(product -> Objects.equals(product.getId(), Long.valueOf(id))).findFirst().orElse(null);
    }

    public void addProduct(Product s) {
        list.add(s);

    }

    public void updateProduct(Product s) {
        for (Product product: list){
            if (product.getId().equals(s.getId())){
                product.setCode(s.getCode());
                product.setDescription(s.getDescription());
                product.setPrice(s.getPrice());
                product.setCreatedOne(s.getCreatedOne());
                product.setStatus(s.getStatus());
            }
        }
    }

    public void removeProduct(Product s) {
        list.remove(s);
    }

    public void addList(List<Product> listOfProducts) {
        for(Product product : listOfProducts){
            list.add(product);
        }
    }
}