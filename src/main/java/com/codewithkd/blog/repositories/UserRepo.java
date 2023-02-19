package com.codewithkd.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithkd.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
