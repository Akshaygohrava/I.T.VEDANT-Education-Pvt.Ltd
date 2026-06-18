package com.study.ecommerce.services;

import java.util.List;

import com.study.ecommerce.dtos.ProductDto;

public interface ProductService {
	
	ProductDto addProduct(ProductDto productDto);
	
	List<ProductDto> getAllProducts();
	
	ProductDto getProductById(Integer id);
	
	ProductDto updateProduct(Integer id,ProductDto productDto);
	
	void deleteProduct(Integer id);

}
