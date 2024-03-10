package com.drain.controller;

import com.drain.model.entity.Product;
import com.drain.service.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


    @RestController
    @RequestMapping("/product")
    public class ProductController {

        private final ProductServiceImpl productServiceimpl;
        public ProductController( ProductServiceImpl productServiceimpl){
            this.productServiceimpl = productServiceimpl;
        }

        @GetMapping
        public ResponseEntity<Iterable<Product>> products(){
            Iterable<Product> productList = productServiceimpl.getAll();
            return new ResponseEntity<>(productList, HttpStatus.OK);
        }
        @PostMapping("/add2")
        public ResponseEntity<Product> addProduct(@RequestBody Product product) {
            Product savedProduct = productServiceimpl.save(product);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        }

    }

