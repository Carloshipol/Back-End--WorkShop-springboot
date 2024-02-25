package com.carlosdeveloper.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdeveloper.project.entities.OrderItem;
import com.carlosdeveloper.project.entities.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
