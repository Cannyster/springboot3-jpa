package com.cannysters.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cannysters.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
