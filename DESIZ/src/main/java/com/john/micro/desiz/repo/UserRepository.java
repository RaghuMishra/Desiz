package com.john.micro.desiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.john.micro.desiz.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
