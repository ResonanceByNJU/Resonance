package com.example.resonance.vo;

import java.util.ArrayList;

public class ChatListVO {
	private ArrayList<ChatVO> chatList;

	public ChatListVO(ArrayList<ChatVO> chatList) {
		super();
		this.chatList = chatList;
	}

	public ArrayList<ChatVO> getChatList() {
		return chatList;
	}
	
	
}
