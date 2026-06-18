package com.study.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data          // @Data is an Annotation, which creates getter and setter
@NoArgsConstructor    // creates non-parameter constructor
@AllArgsConstructor   // Paramterized  Constructor
@Entity   // Creates The Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false,length = 60)
	private String name;
	
	@Column(nullable = false,length = 60)
	private String description;
	
	@Column(nullable = false)
	private Integer price;
	
	@ManyToOne
	private Category category;
	
	
	// Lombok jar download , if yellow error is there, download and install ,and restart
}
