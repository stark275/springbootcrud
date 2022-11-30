package com.spring.crud.app.product.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.crud.app.product.data.entities.Product;
import com.spring.crud.app.product.data.repositositories.ProductRepository;

public class ProductController {
    
    private ProductRepository prodRepo;

    public ProductController(ProductRepository prodRepo) {
        this.prodRepo = prodRepo;
    }

    @RequestMapping("products")

    public List<Product> index() {
        return  prodRepo.findAll();
    }
}
