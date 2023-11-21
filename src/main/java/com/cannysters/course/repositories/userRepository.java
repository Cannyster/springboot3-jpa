package com.cannysters.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cannysters.course.entities.User;

public interface userRepository extends JpaRepository<User, Long>{

}
