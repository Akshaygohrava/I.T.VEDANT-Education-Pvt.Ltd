package com.study.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.study.ecommerce.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {

}
