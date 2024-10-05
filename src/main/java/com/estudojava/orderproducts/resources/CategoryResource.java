package com.estudojava.orderproducts.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudojava.orderproducts.entities.Category;
import com.estudojava.orderproducts.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	public CategoryService categoryService;

	@GetMapping
	public ResponseEntity<List<Category>> getCategorys() {
		
		List<Category> categories = categoryService.findAll();
		
		return ResponseEntity.ok().body(categories);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {

		Category category = categoryService.findById(id);
		
		return ResponseEntity.ok().body(category);
	}
}
