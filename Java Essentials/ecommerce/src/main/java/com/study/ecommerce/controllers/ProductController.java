package com.study.ecommerce.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.ecommerce.dtos.ProductDto;
import com.study.ecommerce.entities.Product;
import com.study.ecommerce.repositories.CartRepository;
import com.study.ecommerce.services.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final CartRepository cartRepository;
	
	@Autowired
	private ProductService productService;

    ProductController(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }
	
//	-----------------------------------------------------
//	 POST - localhost:8080/products
//	------------------------------------------------------
	@PostMapping
	public ResponseEntity<ProductDto> addProduct(@Valid @RequestBody ProductDto product)
	{ 
		
		return new ResponseEntity<ProductDto>(productService.addProduct(product),
				                                                HttpStatus.CREATED);
	}
	
	
//	-----------------------------------------------------------------------
//	GET - localhost:8080/products/	
//	-----------------------------------------------------------------------
	@GetMapping
	public ResponseEntity<List<ProductDto>> getAllProducts()
	{
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	
//	-----------------------------------------------------------------------
//	GET - localhost:8080/products/{id}
//	-----------------------------------------------------------------------
	@GetMapping("/{id}")
	public ResponseEntity<ProductDto> getProductById(@PathVariable Integer id)
	{

		return ResponseEntity.ok(productService.getProductById(id));
	}
	
//	-----------------------------------------------------------------------
//	DELETE - localhost:8080/products/{id}
//	----------------------------------------------------------------------- 
	@DeleteMapping("/{id}")
	public ResponseEntity<Map<String, String>> deleteProduct(@PathVariable Integer id)
	{
		productService.deleteProduct(id);
		HashMap<String, String> response = new HashMap<String, String>();
		response.put("message", "Product deleted successfully");
		return ResponseEntity.ok(response);
	}
	
	
//	-----------------------------------------------------------------------
//	PUT - localhost:8080/products/{id}
//	-----------------------------------------------------------------------
	@PutMapping("/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable Integer id, 
			                                    @RequestBody ProductDto productDto)
	{
		return ResponseEntity.ok(productService.updateProduct(id, productDto));
	}
	
	
	
}
