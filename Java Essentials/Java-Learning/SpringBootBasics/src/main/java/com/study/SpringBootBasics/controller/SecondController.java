package com.study.SpringBootBasics.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.parser.AstString;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.SpringBootBasics.entities.Product;

@RestController
public class SecondController {
	
	@GetMapping("/product")
	public Product getProduct() {
		return new Product(101, "Laptop", 45000);
		
	}
	//   http://localhost:8080/get-Products       , Go To This Websites , And You can see m Data
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101, "Mobile", 12000));
		products.add(new Product(102, "Headpohones", 3000));
		products.add(new Product(103, "Computer", 50000));
		return products;
		
	}
	// http://localhost:8080/products
	
	
	// Adding Products
	@PostMapping("/add-product")
	public String addProduct(@RequestBody Product product) {
		System.out.println("Product " + product);
		return "Product added successfully";
		
		}
	// PutMapping and DeleteMapping Later
	
	
	// Response Entity
	@PostMapping("add-products")
	public ResponseEntity<String> addProducts(@RequestBody Product product) {
		System.out.println(product);
		return new ResponseEntity<String>("Product Added ! " , HttpStatus.CREATED);
	}
	
	
	

}
