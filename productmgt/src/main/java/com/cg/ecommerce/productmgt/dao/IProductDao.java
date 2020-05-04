package com.cg.ecommerce.productmgt.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.ecommerce.productmgt.entities.Product;

public interface IProductDao {

    Product add(Product product);

    List<Product>fetchAll();

    Product findById(String id);

}
