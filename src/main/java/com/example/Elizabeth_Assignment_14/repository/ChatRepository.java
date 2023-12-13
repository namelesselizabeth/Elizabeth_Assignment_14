package com.example.Elizabeth_Assignment_14.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.domain.Chat;

@Repository
public class ChatRepository {

	Map<String, List<Chat>> chats = new HashMap<>();
	
	public List<Chat> findByChannel (Channel channel) {
		List <Chat> chatsByChannel = chats.get(channel.getChannelName());
		return chatsByChannel;
	}

	public void saveMessages(String channelName, List<Chat> chatByChannel) {
		chats.put(channelName, chatByChannel);
	}
}
