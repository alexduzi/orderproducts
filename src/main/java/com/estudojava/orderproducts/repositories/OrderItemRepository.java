package com.estudojava.orderproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.orderproducts.entities.OrderItem;
import com.estudojava.orderproducts.entities.PK.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}	
