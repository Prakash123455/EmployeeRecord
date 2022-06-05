package com.learning.employeemanager.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.employeemanager.security.entity.User;


public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
