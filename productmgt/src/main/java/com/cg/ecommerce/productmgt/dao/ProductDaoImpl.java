package com.cg.ecommerce.productmgt.dao;

import org.springframework.stereotype.Repository;

import com.cg.ecommerce.productmgt.entities.Product;

import java.util.*;

@Repository
public class ProductDaoImpl implements IProductDao{
    private Map<String,Product>store=new HashMap<>();

   

    @Override
    public Product add(Product product) {
        store.put(product.getProductId(),product);
        return product;
    }

    @Override
    public List<Product> fetchAll() {
       Collection<Product>values= store.values();
       List<Product>list=new ArrayList<>(values);
       return list;
    }

    @Override
    public Product findById(String id) {
       Product product= store.get(id);
       return product;
    }
}
