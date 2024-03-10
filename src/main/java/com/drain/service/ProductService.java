package com.drain.service;

import com.drain.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product save(Product product);
    Product edit(Long id);
    Product delete(Long id);

}
