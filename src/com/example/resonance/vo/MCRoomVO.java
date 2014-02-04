package com.example.resonance.vo;

public class MCRoomVO {
	private String chatName;
	private String chatLogoPath;
	
	public MCRoomVO(String chatName, String chatLogoPath) {
		super();
		this.chatName = chatName;
		this.chatLogoPath = chatLogoPath;
	}
	public String getChatName() {
		return chatName;
	}
	public String getChatLogoPath() {
		return chatLogoPath;
	}
	
	
	
}
