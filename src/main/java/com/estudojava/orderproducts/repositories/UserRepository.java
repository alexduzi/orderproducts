package com.estudojava.orderproducts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.orderproducts.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
