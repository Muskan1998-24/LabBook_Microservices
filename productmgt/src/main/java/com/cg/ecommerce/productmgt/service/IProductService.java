package com.cg.ecommerce.productmgt.service;

import java.util.List;

import com.cg.ecommerce.productmgt.entities.Product;

public interface IProductService {
    Product add(Product product);

    List<Product> fetchAll();

    Product findById(String id);
}
