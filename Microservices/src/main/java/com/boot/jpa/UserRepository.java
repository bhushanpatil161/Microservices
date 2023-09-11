package com.boot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
