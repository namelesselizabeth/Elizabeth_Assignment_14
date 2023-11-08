package com.example.Elizabeth_Assignment_14.domain;


public class Chat {

	private String chatMessage;
	private Channel channel;
	
	public Chat (String chatMessage, Channel channel) {
		this.chatMessage = chatMessage;
		this.channel = channel;
	}
	public String getChatMessage() {
		return chatMessage;
	}
	public void setChatMessage(String chatMessage) {
		this.chatMessage = chatMessage;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
}
