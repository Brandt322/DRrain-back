package com.drain.controller;

import com.drain.model.entity.Brand;
import com.drain.service.BrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brand")
public class BrandController {

    private final BrandServiceImpl brandServiceImpl;
    public BrandController (BrandServiceImpl brandServiceImpl){
        this.brandServiceImpl = brandServiceImpl;
    }

    @GetMapping
    public ResponseEntity<Iterable<Brand>> brand(){
        Iterable<Brand> brandList = brandServiceImpl.getAll();
        return new ResponseEntity<>(brandList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Brand> addBrand(@RequestBody Brand brand) {
        Brand savedBrand = brandServiceImpl.save(brand);
        return new ResponseEntity<>(savedBrand, HttpStatus.CREATED);
    }
}
