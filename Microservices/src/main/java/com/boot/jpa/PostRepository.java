package com.boot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
