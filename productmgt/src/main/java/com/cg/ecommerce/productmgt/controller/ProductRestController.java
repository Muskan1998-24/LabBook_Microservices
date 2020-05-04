package com.cg.ecommerce.productmgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecommerce.productmgt.entities.Product;
import com.cg.ecommerce.productmgt.service.IProductService;

import  java.util.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @Autowired
    private IProductService service;
    
    @PostConstruct
    public void createProduct(){
        Product product1 = new Product();
        product1.setProductId("p1");
        product1.setProductName("LG");
        product1.setProductPrice(50000);
        product1.setAvailableItemsCount(10);
        service.add(product1);

        Product product2 = new Product();
        product2.setProductId("p2");
        product2.setProductName("Godrej");
        product2.setProductPrice(70000);
        product2.setAvailableItemsCount(15);
        service.add(product2);
    }

    @GetMapping
    public ResponseEntity<List<Product>>fetchAll(){
      List<Product>products =service.fetchAll();
      ResponseEntity<List<Product>>response=new ResponseEntity<>(products, HttpStatus.OK);
      return response;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Product>findProductById(@PathVariable("id") String id){
       Product product= service.findById(id);
       ResponseEntity<Product>response=new ResponseEntity<>(product,HttpStatus.OK);
       return response;
    }


   

}
