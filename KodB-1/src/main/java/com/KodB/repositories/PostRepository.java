package com.KodB.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.KodB.entites.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
