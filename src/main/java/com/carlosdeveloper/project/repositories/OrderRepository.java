package com.carlosdeveloper.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdeveloper.project.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
