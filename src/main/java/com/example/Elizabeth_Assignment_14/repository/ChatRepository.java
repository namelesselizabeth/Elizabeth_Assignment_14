package com.example.Elizabeth_Assignment_14.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.domain.Chat;

@Repository
public interface ChatRepository extends JpaRepository <Chat, String> {

	List<Chat> findByChannel(Optional<Channel> channel);

}
