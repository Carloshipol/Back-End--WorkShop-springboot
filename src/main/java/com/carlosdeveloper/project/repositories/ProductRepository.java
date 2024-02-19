package com.carlosdeveloper.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdeveloper.project.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
