package com.example.Elizabeth_Assignment_14.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Elizabeth_Assignment_14.domain.User;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

}
