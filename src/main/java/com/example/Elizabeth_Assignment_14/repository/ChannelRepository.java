package com.example.Elizabeth_Assignment_14.repository;

import java.util.ArrayList;
import java.util.List;
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
	
	public Channel findByName(String channelName) {
		Channel channel = channels.stream()
				.filter(channel1 -> channel1.getChannelName().equals(channelName))
				.findAny().get();
		
		return channel;
	}

	

	public List<Channel> findAll() {
		return channels;
	}
}
