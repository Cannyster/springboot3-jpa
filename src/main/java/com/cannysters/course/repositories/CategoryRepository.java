package com.cannysters.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cannysters.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
