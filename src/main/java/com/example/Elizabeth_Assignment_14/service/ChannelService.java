package com.example.Elizabeth_Assignment_14.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.repository.ChannelRepository;

@Service
public class ChannelService {

	@Autowired
	ChannelRepository channelRepository;
	
	public Channel findByChannelName(String channelName) {
		return channelRepository.findByName(channelName);
	}
	
	public Channel createNewChannel(String channelName) {
		Channel existingChannel = channelRepository.findByName(channelName);
		if (existingChannel == null) {
			Channel channel = new Channel();
			channel.setChannelName(channelName);
			return channel;
		}
		return null;
	}
	
	public List<Channel> getAllChannels() {
		return channelRepository.findAll();
	}


}
