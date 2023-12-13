package com.example.Elizabeth_Assignment_14.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Elizabeth_Assignment_14.domain.Chat;
import com.example.Elizabeth_Assignment_14.service.ChatService;

@Controller
public class ChatController {

	@Autowired
	private ChatService chatService;
	
	@GetMapping("/chats/{channelName}")
	public List<Chat> getChatsByChannel (@PathVariable String channelName) {
		List<Chat> chatsByChannel = chatService.getChats(channelName);
		return chatsByChannel;
	}
	
	@PostMapping("/chats")
	public void postChats (@RequestBody Chat chat) {
		chatService.addChats(chat);
	}
}
