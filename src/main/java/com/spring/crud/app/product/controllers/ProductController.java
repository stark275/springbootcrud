package com.spring.crud.app.product.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.app.product.data.entities.Product;
import com.spring.crud.app.product.data.repositositories.ProductRepository;

@RestController
public class ProductController {
    
    private ProductRepository prodRepo;

    public ProductController(ProductRepository prodRepo) {
        this.prodRepo = prodRepo;
    }

    @RequestMapping("products")

    @GetMapping("/")
    public List<Product> index() {
        return  prodRepo.findAll();
    }
}
