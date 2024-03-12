package com.drain.service;

import com.drain.model.entity.Brand;
import com.drain.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{

    private final BrandRepository brandRepository;
    public BrandServiceImpl (BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        List<Brand> brands = brandRepository.findAll();
        return brands;
    }

    @Override
    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }
}
