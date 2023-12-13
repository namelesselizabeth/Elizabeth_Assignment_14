package com.example.Elizabeth_Assignment_14.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.domain.Chat;
import com.example.Elizabeth_Assignment_14.service.ChannelService;
import com.example.Elizabeth_Assignment_14.service.ChatService;

@Controller
public class ChannelController {

	@Autowired
	private ChannelService channelService;
	@Autowired
	private ChatService chatService;
	
	@GetMapping("/welcome") 
	public String getWelcomePage(ModelMap model) {
		List<Channel> channels = channelService.getAllChannels();
		model.put("channels", channels);
	return "welcome";
	}
	

	@GetMapping("/channels/{channelName}") 
		public String getChannelPage(ModelMap model, @PathVariable String channelName) {
			Channel channel = channelService.findByChannelName(channelName);
			
			List<Chat> chatsChannelSorted = chatService.getChats(channelName);
			
			model.put("channel", channel);
			model.put("chats", chatsChannelSorted);
			return "channel";
		}
	
}
