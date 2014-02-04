package com.example.resonance.vo;

import java.util.ArrayList;

public class FriendListVO {
	private ArrayList<FriendVO> friendList;

	public FriendListVO(ArrayList<FriendVO> friendList) {
		super();
		this.friendList = friendList;
	}

	public ArrayList<FriendVO> getFriendList() {
		return friendList;
	}
	
}
