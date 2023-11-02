package com.example.Elizabeth_Assignment_14.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.domain.Chat;
import com.example.Elizabeth_Assignment_14.repository.ChatRepository;

@Service
public class ChatService {

	@Autowired
	private ChannelService channelService;
	
	private ChatRepository chatRepository;
	
	public List<Chat> getChats(String channelName) {
		Optional<Channel> channel = Optional.ofNullable(channelService.findByChannelName(channelName).orElse(new Channel()));
		return chatRepository.findByChannel(channel);
	}

}
