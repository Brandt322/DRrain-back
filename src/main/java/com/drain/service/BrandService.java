package com.drain.service;

import com.drain.model.entity.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
    Brand save(Brand brand);
}
