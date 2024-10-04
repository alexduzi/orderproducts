package com.estudojava.orderproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.orderproducts.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
