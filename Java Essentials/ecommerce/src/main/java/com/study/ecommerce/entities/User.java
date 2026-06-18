package com.study.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
     @Id
     @GeneratedValue(strategy = GenerationType.UUID)
	private String id;
     
    @Column(nullable = false, name = "fname")
	private String firstName;
    
    @Column(nullable = false, name = "lname")
	private String lastName;
    
    @Column(nullable = false, unique = true)
	private String email;
    
    @Column(nullable = false)
	private String password;
	
}
