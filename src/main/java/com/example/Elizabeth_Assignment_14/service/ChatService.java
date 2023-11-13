package com.example.Elizabeth_Assignment_14.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.domain.Chat;
import com.example.Elizabeth_Assignment_14.repository.ChatRepository;

@Service
public class ChatService {

	@Autowired
	private ChannelService channelService;
	
	@Autowired
	private ChatRepository chatRepository;
	
	public List<Chat> getChats(String channelName) {
		Channel channel = channelService.findByChannelName(channelName);
		return chatRepository.findByChannel(channel);
	}

}
