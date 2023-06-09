package com.aanbari.userservice.repository;

import com.aanbari.userservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
}
