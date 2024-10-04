package com.estudojava.orderproducts.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudojava.orderproducts.entities.Order;
import com.estudojava.orderproducts.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	public OrderService OrderService;

	@GetMapping
	public ResponseEntity<List<Order>> getOrders() {
		
		List<Order> Orders = OrderService.findAll();
		
		return ResponseEntity.ok().body(Orders);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {

		Order Order = OrderService.findById(id);
		
		return ResponseEntity.ok().body(Order);
	}
}
