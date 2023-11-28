package com.cannysters.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cannysters.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
