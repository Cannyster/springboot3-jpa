package com.cannysters.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cannysters.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
