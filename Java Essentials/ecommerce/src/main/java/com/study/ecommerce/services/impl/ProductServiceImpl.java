package com.study.ecommerce.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.ecommerce.dtos.ProductDto;
import com.study.ecommerce.entities.Product;
import com.study.ecommerce.repositories.ProductRepository;
import com.study.ecommerce.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDto addProduct(ProductDto productDto) {
 
//	    map method will help you convert dto to entity
		Product product = modelMapper.map(productDto, Product.class);
 //		save method will add object into the table
		Product savedProduct = productRepository.save(product);
		
		return modelMapper.map(savedProduct, ProductDto.class);
	}

	@Override
	public List<ProductDto> getAllProducts() {
		
//		findAll returns all products from products table
		List<Product> products = productRepository.findAll();
		
//		Conversion of entity list to dto list
		List<ProductDto> productDtoList = products.stream()
		.map((p)->modelMapper.map(p, ProductDto.class))
		.toList();
		
		return productDtoList;
	}

	@Override
	public ProductDto getProductById(Integer id) {
		
	   Product product = productRepository.findById(id)
	   .orElseThrow(()->new RuntimeException("Id not found"));
	 
		return modelMapper.map(product, ProductDto.class);
	}

	@Override
	public ProductDto updateProduct(Integer id, ProductDto productDto) {
		
		Product product = productRepository.findById(id)
				.orElseThrow(()->new RuntimeException("Id not found"));
		
		product.setName(productDto.getName());
		product.setDescription(productDto.getDescription());
		product.setPrice(productDto.getPrice());
		
		Product updatedProduct = productRepository.save(product);
		
		return modelMapper.map(updatedProduct, ProductDto.class);
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

	@Override
	public void deleteProduct(Integer id) {
		
		Product product = productRepository.findById(id)
		.orElseThrow(()->new RuntimeException("Id not found"));
		
		productRepository.delete(product);
		
	}
	

}
