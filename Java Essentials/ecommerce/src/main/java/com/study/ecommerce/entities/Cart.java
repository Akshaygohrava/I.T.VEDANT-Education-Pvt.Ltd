package com.study.ecommerce.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "cart")
	private List<CartItem> cartItem;
	
	
}
