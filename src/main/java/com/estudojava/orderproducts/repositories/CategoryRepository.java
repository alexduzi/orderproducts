package com.estudojava.orderproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.orderproducts.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
