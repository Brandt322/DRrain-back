package com.drain.service;

import com.drain.model.entity.Product;
import com.drain.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    public ProductServiceImpl( ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = productRepository.findAll();
        return products;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product edit(Long id) {
        return null;
    }

    @Override
    public Product delete(Long id) {
        return null;
    }
}
