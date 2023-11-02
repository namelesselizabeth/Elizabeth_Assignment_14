package com.example.Elizabeth_Assignment_14.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.Elizabeth_Assignment_14.domain.Channel;

@Repository
public class ChannelRepository {

	private List<Channel> channels = new ArrayList<>();
	
	public ChannelRepository() {
		Channel general = new Channel();
		general.setChannelId((long) 1);
		general.setChannelName("General");
		
		channels.add(general);
	}
	
	public Optional<Channel> findByName(String channelName) {
		return channels.stream()
				.filter(channel -> channel.getChannelName().equals(channelName))
				.findAny();
	}

	

	public List<Channel> findAll() {
		return channels;
	}
}
