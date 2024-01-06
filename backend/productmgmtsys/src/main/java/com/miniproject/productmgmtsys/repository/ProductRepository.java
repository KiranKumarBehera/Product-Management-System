package com.miniproject.productmgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniproject.productmgmtsys.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
