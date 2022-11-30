package com.spring.crud.app.product.data.repositositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.app.product.data.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
