package com.study.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.ecommerce.entities.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Integer>{

}
