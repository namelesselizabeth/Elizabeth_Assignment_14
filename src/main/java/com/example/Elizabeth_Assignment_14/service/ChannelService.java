package com.example.Elizabeth_Assignment_14.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Elizabeth_Assignment_14.domain.Channel;
import com.example.Elizabeth_Assignment_14.repository.ChannelRepository;

@Service
public class ChannelService {

	@Autowired
	ChannelRepository channelRepository;
	
	public Optional<Channel> findByChannelName(String channelName) {
		return Optional.ofNullable(channelRepository.findByName(channelName).orElse(new Channel()));
	}
	
	public Channel createNewChannel(String channelName) {
		Optional<Channel> existingChannel = channelRepository.findByName(channelName);
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
