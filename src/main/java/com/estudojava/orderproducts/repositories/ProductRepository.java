package com.estudojava.orderproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.orderproducts.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
